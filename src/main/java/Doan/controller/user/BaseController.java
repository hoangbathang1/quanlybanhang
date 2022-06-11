package Doan.controller.user;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.IMPLCategoryService;
import Doan.Service.user.ImplMenusService;

@Controller
public class BaseController {
	@Autowired
	ImplMenusService menusService;
	@Autowired
	IMPLCategoryService categoryservice;
	public ModelAndView _mv = new ModelAndView();
	@PostConstruct
	public ModelAndView init() {
		_mv.addObject("Menus",menusService.hienthi());
		_mv.addObject("category", categoryservice.hienthi());
		return _mv;
		
	}
	

}
