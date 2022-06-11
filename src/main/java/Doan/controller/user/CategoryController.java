package Doan.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Doan.Dto.user.ProductDto;
import Doan.Service.user.IPLMPaginateService;
import Doan.Service.user.IPLMProductService;

@Controller
public class CategoryController extends BaseController {
	@Autowired 
	IPLMProductService productservice;
	@Autowired
	IPLMPaginateService paginateservice;
	@RequestMapping(value = "/category")
  public ModelAndView hienthi( @RequestParam("id") int id, @RequestParam("page") int page) {
		_mv.setViewName("user/category/category");
		List<ProductDto> list = productservice.hienthibyidcategory(id);
		_mv.addObject("listproduct",list);
		_mv.addObject("id", id );
		_mv.addObject("paginate", paginateservice.hienthi(page, list.size(), 6));
		return _mv;
	}
	

}
