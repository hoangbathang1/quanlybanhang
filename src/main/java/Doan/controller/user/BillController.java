package Doan.controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Doan.Dto.user.CartDTO;
import Doan.Service.user.IBillService;
import Doan.Service.user.IPLMBillsService;
import Doan.entity.user.Bill;
import Doan.entity.user.DetailBills;
import Doan.entity.user.user;

@Controller
public class BillController extends BaseController {
	@Autowired
	IPLMBillsService billservice;
	@RequestMapping(value ="/checkout", method = RequestMethod.GET)
	public ModelAndView hienthi(HttpSession session) {
		_mv.setViewName("user/bills/checkout");
		_mv.addObject("user", new user());
		user item = (user) session.getAttribute("account");
		Bill bill = new Bill();
		if(item != null) {
			session.removeAttribute("status");
			bill.setUser_id(item.getId());
			bill.setAddress(item.getAddress());
			bill.setEmail(item.getEmail());
			bill.setPhone(item.getPhone());
			bill.setFullname(item.getFullname());
			_mv.addObject("bill", bill);
			_mv.addObject("bill1", bill);
		}
	
		
		return _mv;
	}

	@RequestMapping(value = "/checkout",method = RequestMethod.POST)
	public String themhoadon(@ModelAttribute("bill") Bill bill,@ModelAttribute("bill") Bill bill1,HttpSession session) {
		double total = (Double) session.getAttribute("tongtien");
		HashMap<Integer, CartDTO> cart = (HashMap<Integer, CartDTO>) session.getAttribute("Cart");
		user user = (Doan.entity.user.user) session.getAttribute("account");
		bill.setUser_id(user.getId());
		bill.setPrice(total);
		if(billservice.themhoadon(bill)>0) {
			billservice.themdetailbill(cart);
			
			session.removeAttribute("tongtien");
			session.removeAttribute("soluong");
			session.removeAttribute("Cart");
			
		}
		
		

		bill.setUser_id(user.getId());
		bill.setPrice(total);
		if(billservice.themhoadon(bill1)>0) {
			billservice.themdetailbill(cart);
			
			session.removeAttribute("tongtien");
			session.removeAttribute("soluong");
			session.removeAttribute("Cart");
			
		}
		
		return "redirect:hoa-don";
	}
	@RequestMapping(value = "hoa-don", method = RequestMethod.GET)
	public ModelAndView hienthibill(HttpSession session) {
		
		user user = (Doan.entity.user.user) session.getAttribute("account");
		if(user!=null) {
			int id = user.getId();
			_mv.addObject("listbill",billservice.hienthibill(id));
		}
		else {
		    _mv.clear();
		}
		_mv.setViewName("user/bills/hoadon");
		return _mv;
	}

}
