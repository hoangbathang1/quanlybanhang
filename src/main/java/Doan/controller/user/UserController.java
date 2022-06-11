package Doan.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.IPLMUserService;
import Doan.entity.user.user;

@Controller
public class UserController extends BaseController {
	@Autowired
	IPLMUserService userservice;

	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView dangnhap(HttpSession session) {
		_mv.setViewName("user/account/dangnhap");
		_mv.addObject("user", new user());
		user item = (user) session.getAttribute("account");
		if (item != null) {
			_mv.setViewName("redirect:trang-chu");
			session.removeAttribute("status");
		}
		return _mv;
	}

	@RequestMapping(value = "/dang-xuat")
	public String dangxuat(HttpSession session,HttpServletRequest rq) {
		session.removeAttribute("account");
		return "redirect:"+rq.getHeader("Referer");
	}

	@RequestMapping(value = "/xuly-dang-nhap", method = RequestMethod.POST)
	public ModelAndView dangnhapuser(@ModelAttribute("User") user User, HttpSession session, HttpServletRequest rq) {
		user item = userservice.dangnhap(User);
		if (item != null) {
			session.setAttribute("account", item);
		} else {
			session.setAttribute("status", "tai khoan mat khau khong chinh xac");
		}

		_mv.setViewName("redirect:" + rq.getHeader("Referer"));
		return _mv;
	}

	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
	public ModelAndView dangky() {
		_mv.setViewName("user/account/dangky");
		_mv.addObject("user", new user());
		return _mv;
	}

	@RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
	public ModelAndView taotaikhoan(@ModelAttribute("User") user User) {
		int check = userservice.dangky(User);
		if (check == 0) {
			_mv.addObject("status", "tạo tài khoản thất bại");
		}
		if (check == 1) {
			_mv.addObject("status", "tạo tài khoản thành công");
		}
		_mv.setViewName("user/account/dangky");
		_mv.addObject("user", new user());
		return _mv;
	}

}
