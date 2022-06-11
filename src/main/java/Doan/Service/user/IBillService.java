package Doan.Service.user;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import Doan.Dto.user.CartDTO;
import Doan.entity.user.Bill;
import Doan.entity.user.DetailBills;
import Doan.entity.user.doanhthu;

@Service
public interface IBillService {
	public int themhoadon(Bill bill);
	public void themdetailbill(HashMap<Integer, CartDTO> cart);
	public List<Bill> hienthibill(int user);
	public List<Bill> hienthitatcahoadon();
	public Bill hienthihoadontheoid(int id);
	public int suahoadon(Bill bill);
	public int xoahoadon(int id);
	public doanhthu hienthidoanhthu();
}
