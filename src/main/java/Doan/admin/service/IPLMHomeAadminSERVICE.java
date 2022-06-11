package Doan.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.admin.dao.HomeAdmin;
import Doan.entity.user.Bill;
import Doan.entity.user.user;

@Service
public class IPLMHomeAadminSERVICE implements IHomeAdminService {
    @Autowired
    HomeAdmin home;
	public int tongsanpham() {
		
		return home.soluongsanpham();
	}
	public int tongkhachhang() {
		
		return home.tongkhachhang();
	}
	public int tongdonhang() {
		
		return home.tongdonhang();
	}
	public int tonghangcannhap() {
		
		return home.tonghangcannhap();
	}
	public List<Bill> tinhtrangdonhang() {
		
		return home.tinhtrangdonhang();
	}
	public List<user> khachhangmoi() {
		
		return home.khachhangmoi();
	}

}
