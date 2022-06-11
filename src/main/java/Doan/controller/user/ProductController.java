package Doan.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.fabric.xmlrpc.base.Value;

import Doan.Service.user.IPLMProductService;

@Controller
public class ProductController extends BaseController {
	@Autowired
	IPLMProductService productservice;
  @RequestMapping(value = "/product/{id}")
   public ModelAndView hienthi(@PathVariable int id) {
    	_mv.addObject("product", productservice.hienthiproductbyid(id));
    	_mv.setViewName("user/product/product");
    	
    	return _mv;
    	
    }


}
