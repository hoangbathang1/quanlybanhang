package Doan.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.CategoryDao;
import Doan.entity.user.Category;
@Service
public class IMPLCategoryService implements ICategoryService {
    @Autowired
    CategoryDao categorydao;
	public List<Category> hienthi() {
		
		return categorydao.hienthi();
	}
	public int themdanhmuc(Category danhmuc) {
		// TODO Auto-generated method stub
		return categorydao.them(danhmuc);
	}
	public Category laydanhmuctuid(int id) {
		// TODO Auto-generated method stub
		return categorydao.laydanhmuctuid(id);
	}
	public int suadanhmuc(Category danhmuc) {
		// TODO Auto-generated method stub
		return categorydao.sua(danhmuc);
	}
	public int xoa(int id) {
		// TODO Auto-generated method stub
		return categorydao.xoa(id);
	}
	

}
