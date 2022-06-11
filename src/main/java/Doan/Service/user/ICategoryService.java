package Doan.Service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import Doan.entity.user.Category;
@Service
public interface ICategoryService {
	public List<Category> hienthi();
    public int themdanhmuc(Category danhmuc);
    public Category laydanhmuctuid(int id);
    public int suadanhmuc(Category danhmuc);
    public int xoa(int id);
}
