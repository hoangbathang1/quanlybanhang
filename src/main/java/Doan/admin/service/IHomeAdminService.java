package Doan.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Doan.entity.user.Bill;
import Doan.entity.user.user;

@Service
public interface IHomeAdminService {
	public int tongsanpham();
    public int tongkhachhang();
    public int tongdonhang();
    public int tonghangcannhap();
    public List<Bill> tinhtrangdonhang();
    public List<user> khachhangmoi();
}
