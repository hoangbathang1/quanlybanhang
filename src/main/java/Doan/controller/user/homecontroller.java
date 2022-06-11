package Doan.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.IPLMProductService;
import Doan.Service.user.ImplMenusService;

@Controller
public class homecontroller extends BaseController {
     @Autowired
     IPLMProductService productservice;
	@RequestMapping(value = {"/trang-chu","/"})
	public ModelAndView hienthi() {
		_mv.addObject("listnew",productservice.hienthiproductnew());
		_mv.addObject("listmany",productservice.hienthiproductmany());
		_mv.setViewName("user/index");
		return _mv;
		
	}
	

}
