package Doan.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Doan.admin.entity.admin;
import Doan.admin.service.IPLMHomeAadminSERVICE;

@Controller
@RequestMapping("/admin/home")
public class HomeController extends BaseController {
	@Autowired
	IPLMHomeAadminSERVICE product;
	@GetMapping
	public ModelAndView home(HttpSession session) {
		_mv.setViewName("admin/home/home");
		admin Admin = (admin) session.getAttribute("admin");
		
		if(Admin==null) {
	     _mv.setViewName("redirect:/admin1/login");
			
			
		}
		
		
		_mv.addObject("tongsanpham",product.tongsanpham() );
		_mv.addObject("tongkhachhang",product.tongkhachhang() );
		_mv.addObject("tongdonhang",product.tongdonhang() );
		_mv.addObject("tongproductcannhap",product.tonghangcannhap() );
		_mv.addObject("trinhtrangdonhang",product.tinhtrangdonhang() );
		_mv.addObject("khachangmoi",product.khachhangmoi() );
		return _mv;
	}

}
