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

import Doan.Dto.user.ProductDto;
import Doan.Service.user.IPLMProductService;
import Doan.entity.user.Category;

@Controller

public class ProductAdminController extends BaseController {
	@Autowired
	IPLMProductService product;
	@RequestMapping("/admin/product")
	public ModelAndView home() {
		_mv.addObject("product",product.hienthitatcaproduct());
		_mv.setViewName("admin/product/product");
		
		return _mv;
	}
	@RequestMapping(value="/admin/product/them")
	public ModelAndView themdanhmuc() {
       _mv.addObject("product", new ProductDto());
		_mv.setViewName("admin/product/them");
		
		return _mv;
	}
	@RequestMapping(value="/admin/product/them-product",method = RequestMethod.POST)
	public ModelAndView xulythem(@ModelAttribute("product") ProductDto product,HttpServletRequest rq) {
		if(this.product.themproduct(product)==1) {
			_mv.setViewName("redirect:/admin/product");
		}else {
			_mv.setViewName("redirect:/admin/product");
			
		}

		
		return _mv;
	}
	@RequestMapping(value="/admin/product/sua/{id}")
	public ModelAndView suaproduct(@PathVariable int id) {
       _mv.addObject("product", product.layproducttuid(id));
		_mv.setViewName("admin/product/sua");
		
		return _mv;
	}
	@RequestMapping(value="/admin/product/sua/sua-product",method = RequestMethod.POST)
	public ModelAndView xulysua(@ModelAttribute("product") ProductDto product,HttpServletRequest rq) {
		if(this.product.suaproduct(product)==1) {
			_mv.setViewName("redirect:/admin/product");
		}else {
			_mv.setViewName("redirect:/admin/product");
			
		}

		
		return _mv;
	}
	@RequestMapping(value="/admin/product/xoa/{id}")
	public ModelAndView xoadanhmuc(@PathVariable int id) {
		if(product.xoaproduct(id)==1) {
			_mv.setViewName("redirect:/admin/product");
		}else {
			_mv.setViewName("redirect:/admin/product");
			
		}
		
		return _mv;
	}

}
