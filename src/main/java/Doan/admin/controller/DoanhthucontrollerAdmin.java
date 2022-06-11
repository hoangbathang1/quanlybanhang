package Doan.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.IPLMBillsService;
import Doan.Service.user.IPLMProductService;
@Controller
@RequestMapping("/admin/doanhthu")
public class DoanhthucontrollerAdmin extends BaseController {
	@Autowired
	IPLMBillsService bill;
	@GetMapping
	public ModelAndView home() {
		_mv.addObject("doanhthu",bill.hienthidoanhthu());
		_mv.setViewName("admin/doanhthu/doanhthu");
		
		return _mv;
	}

}
