package Doan.Dao.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Doan.Dto.user.MapperProductDto;
import Doan.Dto.user.ProductDto;
import Doan.entity.user.MapperUser;
import Doan.entity.user.user;

@Repository
public class UserDao extends BaseDao {
	public int dangky(user User) {
		String sql = "INSERT INTO `user`( `username`, `password`, `fullname`, `email`, `phone`, `address`) VALUES "
				+ " ('"+User.getUsername()+"','"+User.getPassword()+"','"+User.getFullname()+"','"+User.getEmail()+"','"+User.getPhone()+"','"+User.getAddress()+"')";
		int insert=0;
		String sqlcheck = "select * from user where username ='"+User.getUsername()+"' ";
		List<user> list = new ArrayList<user>();
		list= _jdbctemplate.query(sqlcheck, new Doan.entity.user.MapperUser());
		if(list.size()>0) {
			return  insert;
		}else {
			insert = _jdbctemplate.update(sql);
			
		}
		return insert;
	}
	public user kiemtradangnhap(user User) {
		String sql ="SELECT * FROM `user` WHERE username = '"+User.getUsername()+"' AND password = '"+User.getPassword()+"' ";
		user item;
		try {
			 item = _jdbctemplate.queryForObject(sql, new MapperUser());
		} catch (Exception e) {
			return null;
		}
		return item;
		
		
	}
	public List<user> laytatcauser(){
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from `user` ");
		List<user> list = _jdbctemplate.query(sql.toString(), new MapperUser());
		
		return list;
	}
	

}
