package Doan.Dao.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Doan.entity.user.Category;
import Doan.entity.user.MapperCategory;
import Doan.entity.user.MapperUser;
import Doan.entity.user.user;
@Repository
public class CategoryDao extends BaseDao {
	public List<Category> hienthi(){
		List<Category> list = new ArrayList<Category>();
		String sql = "select * from category";
		list = _jdbctemplate.query(sql, new MapperCategory());
		return list;
	}
	public int them(Category danhmuc) {
		String sql = "INSERT INTO `category`( `name`) VALUES "
				+ " ('"+danhmuc.getName()+"')";
		int insert=0;
			insert = _jdbctemplate.update(sql);
			
		return insert;
	}
	public Category laydanhmuctuid(int id) {
		String sql ="SELECT * FROM `category` WHERE id = '"+id+"' ";
		Category item;
		try {
			 item = _jdbctemplate.queryForObject(sql, new MapperCategory());
		} catch (Exception e) {
			return null;
		}
		return item;
		
		
	}
	public int sua(Category danhmuc) {
		String sql = " UPDATE `category` SET `name`='"+danhmuc.getName()+" ' WHERE id= "+danhmuc.getId();
		int insert=0;
			insert = _jdbctemplate.update(sql);
			
		return insert;
	}
	public int xoa(int id) {
		String sql = "DELETE FROM `category` WHERE id="+id;
		int insert=0;
			insert = _jdbctemplate.update(sql);
			
		return insert;
	}
	

}
