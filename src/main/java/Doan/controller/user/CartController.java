package Doan.controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Doan.Dto.user.CartDTO;
import Doan.Dto.user.ProductDto;
import Doan.Service.user.IPLMCartService;

@Controller
public class CartController extends BaseController {
	@Autowired IPLMCartService cartservice;
	@RequestMapping(value = "/addcart")
	public String addCart(@RequestParam("id") int id, @RequestParam("soluong") int soluong,HttpServletRequest req, HttpSession session) {
		HashMap<Integer, CartDTO> list = (HashMap<Integer, CartDTO >) session.getAttribute("Cart");
		if(list == null) {
			list = new HashMap<Integer, CartDTO>();
		}
		session.setAttribute("Cart", cartservice.addcart(id, list,soluong));
		session.setAttribute("tongtien", cartservice.tongtien(list));
		session.setAttribute("soluong", cartservice.tongsoluong(list));
		return "redirect:"+req.getHeader("Referer");
		
	}
	@RequestMapping(value = "gio-hang")
	public ModelAndView hienthi() {
		_mv.setViewName("user/cart/listcart");
		return _mv;
	}
	@RequestMapping(value = "/deletecart")
	public String delete(@RequestParam("id") int id, HttpServletRequest rq,HttpSession session) {
		HashMap<Integer, CartDTO> list = (HashMap<Integer, CartDTO >) session.getAttribute("Cart");
		if(list == null) {
			list = new HashMap<Integer, CartDTO>();
		}
		session.setAttribute("Cart", cartservice.delete(list, id));
		session.setAttribute("tongtien", cartservice.tongtien(list));
		session.setAttribute("soluong", cartservice.tongsoluong(list));
		return "redirect:"+rq.getHeader("Referer");
	}
	@RequestMapping(value = "/editcart")
	public String edit(@RequestParam("id") int id,@RequestParam("soluong") int soluong, HttpServletRequest rq,HttpSession session) {
		HashMap<Integer, CartDTO> list = (HashMap<Integer, CartDTO >) session.getAttribute("Cart");
		if(list == null) {
			list = new HashMap<Integer, CartDTO>();
		}
		session.setAttribute("Cart", cartservice.edit(list, id, soluong));
		session.setAttribute("tongtien", cartservice.tongtien(list));
		session.setAttribute("soluong", cartservice.tongsoluong(list));
		return "redirect:"+rq.getHeader("Referer");
	}
	
	

}
