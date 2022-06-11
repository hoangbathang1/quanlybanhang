package Doan.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.IPLMUserService;
import Doan.admin.entity.admin;
import Doan.admin.service.IPLMadminService;
import Doan.entity.user.user;

@Controller
public class LoginController {
	@Autowired
	IPLMadminService adminservice;
	public ModelAndView _mv = new ModelAndView();
	@RequestMapping(value = "/admin1/login", method = RequestMethod.GET)
	public ModelAndView dangnhap(HttpSession session) {
		_mv.setViewName("layout/login");
		_mv.addObject("user", new admin());
		admin item = (admin) session.getAttribute("admin");
		if (item != null) {
			_mv.setViewName("redirect:/admin/home");
		}
		return _mv;
	}
	@RequestMapping(value = "/admin1/dang--nhap", method = RequestMethod.POST)
	public ModelAndView dangnhapuser(@ModelAttribute("Admin") admin Admin, HttpSession session, HttpServletRequest rq) {
		admin item = adminservice.dangnhap(Admin);
		if (item != null) {
			session.setAttribute("admin", item);
		}

		_mv.setViewName("redirect:" + rq.getHeader("Referer"));
		return _mv;
	}
	@RequestMapping(value = "/admindangxuat", method = RequestMethod.GET)
	public ModelAndView danxuat(HttpSession session) {
		session.removeAttribute("admin");
		_mv.setViewName("redirect:/admin1/login");
		return _mv;
		
	}


}
