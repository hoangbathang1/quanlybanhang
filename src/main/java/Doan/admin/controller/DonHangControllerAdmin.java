package Doan.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.IPLMBillsService;
import Doan.entity.user.Bill;
import Doan.entity.user.Category;

@Controller

public class DonHangControllerAdmin extends BaseController {
	@Autowired
	IPLMBillsService donhang;
	@RequestMapping("/admin/donhang")
	public ModelAndView home() {
	_mv.addObject("donhang",donhang.hienthitatcahoadon());
		_mv.setViewName("admin/donhang/donhang");
		
		return _mv;
	}
	@RequestMapping(value="/admin/donhang/sua/{id}")
	public ModelAndView suadonhang(@PathVariable int id) {
       _mv.addObject("donhang", donhang.hienthihoadontheoid(id));
		_mv.setViewName("admin/donhang/sua");
		
		return _mv;
	}
	@RequestMapping(value="/admin/donhang/sua/sua-hoadon",method = RequestMethod.POST)
	public ModelAndView xulysua(@ModelAttribute("hoadon") Bill hoadon,HttpServletRequest rq) {
		if(donhang.suahoadon(hoadon)==1) {
			_mv.setViewName("redirect:/admin/donhang");
		}else {
			_mv.setViewName("redirect:/admin/donhang");
			
		}

		
		return _mv;
	}
	@RequestMapping(value="/admin/donhang/xoa/{id}")
	public ModelAndView xoadonhang(@PathVariable int id) {
		if(donhang.xoahoadon(id)==1) {
			_mv.setViewName("redirect:/admin/donhang");
		}else {
			_mv.setViewName("redirect:/admin/donhang");
			
		}
		
		
		return _mv;
	}


}
