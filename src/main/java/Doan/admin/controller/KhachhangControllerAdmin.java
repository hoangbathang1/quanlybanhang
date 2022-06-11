package Doan.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Doan.Dao.user.UserDao;
import Doan.Service.user.IPLMUserService;

@Controller
@RequestMapping("/admin/khachhang")
public class KhachhangControllerAdmin extends BaseController {
	@Autowired
	IPLMUserService khachhang;
	@GetMapping
	public ModelAndView hienthi() {
	    _mv.addObject("khachhang",khachhang.laytatcauser());
		_mv.setViewName("admin/khachhang/khachhang");
		
		return _mv;
	}

	

}
