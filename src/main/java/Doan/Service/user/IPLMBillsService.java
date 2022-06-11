package Doan.Service.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.BillsDao;
import Doan.Dto.user.CartDTO;
import Doan.entity.user.Bill;
import Doan.entity.user.DetailBills;
import Doan.entity.user.doanhthu;
@Service
public class IPLMBillsService implements IBillService {
    @Autowired
    BillsDao billdao;
	public int themhoadon(Bill bill) {
		
		return billdao.themhoadon(bill);
	}
	public void themdetailbill(HashMap<Integer, CartDTO> cart) {
		int idbill = billdao.layidcart();
		DetailBills detailbill = new DetailBills();
		detailbill.setCart_id(idbill);
		for(Map.Entry<Integer, CartDTO> item : cart.entrySet()) {
			detailbill.setProduct_id(item.getValue().getProduct().getId());
			detailbill.setPrice(item.getValue().getTotal());
			detailbill.setProduct_quantity(item.getValue().getSoluong());
			billdao.themdetailhoadon(detailbill);
		}
		
	}
	public List<Bill> hienthibill(int user) {
		// TODO Auto-generated method stub
		return billdao.hienthihoadon(user);
	}
	public List<Bill> hienthitatcahoadon() {
		// TODO Auto-generated method stub
		return billdao.hienthitatcahoadon();
	}
	public Bill hienthihoadontheoid(int id) {
		// TODO Auto-generated method stub
		return billdao.hienthihoadontheoid(id);
	}
	public int suahoadon(Bill bill) {
		// TODO Auto-generated method stub
		return billdao.suahoadon(bill);
	}
	public int xoahoadon(int id) {
		// TODO Auto-generated method stub
		return billdao.xoadonhang(id);
	}
	public doanhthu hienthidoanhthu() {
		// TODO Auto-generated method stub
		return billdao.hienthidoanhthu();
	}

}
