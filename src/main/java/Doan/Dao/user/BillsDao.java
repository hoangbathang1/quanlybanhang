package Doan.Dao.user;

import java.util.List;

import org.springframework.stereotype.Controller;

import Doan.entity.user.Bill;
import Doan.entity.user.DetailBills;
import Doan.entity.user.MapperBills;
import Doan.entity.user.MapperDoanhthu;
import Doan.entity.user.doanhthu;

@Controller
public class BillsDao extends BaseDao {
	public int themhoadon(Bill bill) {
		String sql = "INSERT INTO `cart`( "
				+ "`create__date`, `status`, `user_id`, `price`, `address`, `email`, `phone`,`fullname`) "
				+ "VALUES (CURRENT_TIMESTAMP,'dang xu ly','"+bill.getUser_id()+"','"+bill.getPrice()+"','"+bill.getAddress()+"','"+bill.getEmail()+"','"+bill.getPhone()+"','"+bill.getFullname()+"')";
		
		return _jdbctemplate.update(sql);
	}
	public int themdetailhoadon( DetailBills bill) {
		String sql = "INSERT INTO `cart_detail`( `product_id`, `cart_id`, `product_quantity`, `price`) VALUES ('"+bill.getProduct_id()+"','"+bill.getCart_id()+"','"+bill.getProduct_quantity()+"','"+bill.getPrice()+"')";
		return _jdbctemplate.update(sql);
		
	}
	public int layidcart() {
		String sql = "SELECT MAX(id) FROM `cart`";
		int id = _jdbctemplate.queryForObject(sql, new Object[] {},int.class);
		return id;
	}
	public List<Bill> hienthihoadon(int id){
		String sql = "select * from cart inner join user on cart.user_id = user.id where user.id = " + id;
		List<Bill> list;
		try {
			 list =  _jdbctemplate.query(sql, new MapperBills());
		} catch (Exception e) {
			list=null;
		}
		return list;
		
	}
	public List<Bill> hienthitatcahoadon(){
		String sql = "select * from `cart`" ;
		List<Bill> list;
		try {
			 list =  _jdbctemplate.query(sql, new MapperBills());
		} catch (Exception e) {
			list=null;
		}
		return list;
		
	}
	public Bill hienthihoadontheoid(int id){
		String sql = "select * from `cart` where id ="+ id ;
		Bill list;
		try {
			 list =  _jdbctemplate.queryForObject(sql, new MapperBills());
		} catch (Exception e) {
			list=null;
		}
		return list;
		
	}
	public int suahoadon(Bill bill) {
		String sql = "UPDATE `cart` SET `id`='"+bill.getId()+"', `status`='"+bill.getStatus()+"',`price`='"+bill.getPrice()+"',`address`='"+bill.getAddress()+"',`email`='"+bill.getEmail()+"',`phone`='"+bill.getPhone()
		+"',`fullname`='"+bill.getFullname()+"',`user_id`='"+bill.getUser_id()+" '  WHERE id="+bill.getId();
		
		return _jdbctemplate.update(sql);
	}
	public int xoadonhang(int  id) {
		String sql = "DELETE FROM `cart` WHERE id="+ id;
		
		return _jdbctemplate.update(sql);
	}
	public doanhthu hienthidoanhthu(){
		String sql = "SELECT SUM(price) as doanhthu FROM `cart` WHERE status='da nhan hang'";
		doanhthu list;
		try {
			 list =  _jdbctemplate.queryForObject(sql, new MapperDoanhthu());
		} catch (Exception e) {
			list=null;
		}
		return list;
		
	}

}
