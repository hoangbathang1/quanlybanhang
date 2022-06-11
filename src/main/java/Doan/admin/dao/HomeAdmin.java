package Doan.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import Doan.Dao.user.BaseDao;
import Doan.Dto.user.CartDTO;
import Doan.Dto.user.MapperProductDto;
import Doan.Dto.user.ProductDto;
import Doan.entity.user.Bill;
import Doan.entity.user.MapperBills;
import Doan.entity.user.MapperUser;
import Doan.entity.user.user;

@Repository
public class HomeAdmin extends BaseDao {
	public int soluongsanpham() {
		String sql ="SELECT * FROM `product` ";
		List<ProductDto> list = _jdbctemplate.query(sql, new MapperProductDto());
		return list.size();
	}
	public int tongkhachhang() {
		String sql ="select * from user";
		List<user> list = _jdbctemplate.query(sql, new MapperUser());
		return list.size();
		
	}
	public int tongdonhang() {
		String sql = "select * from cart";
		List<Bill> list = _jdbctemplate.query(sql, new MapperBills());
		return list.size();
	}
	public int tonghangcannhap() {
		String sql = "select * from `product` where quantity <10";
		List<ProductDto> list = _jdbctemplate.query(sql, new MapperProductDto());
		return list.size();
	}
	public List<Bill> tinhtrangdonhang() {
		String sql = "select * from `cart`limit 5";
		List<Bill> list = _jdbctemplate.query(sql, new MapperBills());
		return list;
	}
	public List<user> khachhangmoi() {
		String sql = "select * from `user`  limit 3";
		List<user> list = _jdbctemplate.query(sql, new MapperUser());
		
		return list;
	}
	

}
