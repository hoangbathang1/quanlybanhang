package Doan.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.IMPLCategoryService;
import Doan.entity.user.Bill;
import Doan.entity.user.Category;

@Controller

public class DanhmucControllerAdmin  extends BaseController{
	@Autowired
	IMPLCategoryService danhmuc1;
	@RequestMapping(value="/admin/danhmuc")
	public ModelAndView hienthi() {
		_mv.addObject("danhmuc",danhmuc1.hienthi());
		_mv.setViewName("admin/danhmuc/danhmuc");
		
		return _mv;
	}
	@RequestMapping(value="/admin/danhmuc/them")
	public ModelAndView themdanhmuc() {
       _mv.addObject("danhmuc", new Category());
		_mv.setViewName("admin/danhmuc/them");
		
		return _mv;
	}
	@RequestMapping(value="/admin/danhmuc/them-danhmuc",method = RequestMethod.POST)
	public ModelAndView xulythem(@ModelAttribute("danhmuc") Category danhmuc,HttpServletRequest rq) {
		if(danhmuc1.themdanhmuc(danhmuc)==1) {
			_mv.setViewName("redirect:/admin/danhmuc");
		}else {
			_mv.setViewName("redirect:/admin/danhmuc");
			
		}

		
		return _mv;
	}
	@RequestMapping(value="/admin/danhmuc/sua/{id}")
	public ModelAndView suadanhmuc(@PathVariable int id) {
       _mv.addObject("danhmuc", danhmuc1.laydanhmuctuid(id));
		_mv.setViewName("admin/danhmuc/sua");
		
		return _mv;
	}
	
	@RequestMapping(value="/admin/danhmuc/sua/sua-danhmuc",method = RequestMethod.POST)
	public ModelAndView xulysua(@ModelAttribute("danhmuc") Category danhmuc,HttpServletRequest rq) {
		if(danhmuc1.suadanhmuc(danhmuc)==1) {
			_mv.setViewName("redirect:/admin/danhmuc");
		}else {
			_mv.setViewName("redirect:/admin/danhmuc");
			
		}

		
		return _mv;
	}
	@RequestMapping(value="/admin/danhmuc/xoa/{id}")
	public ModelAndView xoadanhmuc(@PathVariable int id) {
		if(danhmuc1.xoa(id)==1) {
			_mv.setViewName("redirect:/admin/danhmuc");
		}else {
			_mv.setViewName("redirect:/admin/danhmuc");
			
		}
		
		return _mv;
	}
	
}
