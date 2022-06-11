package Doan.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.ProductsDao;
import Doan.Dto.user.ProductDto;

@Service
public class IPLMProductService implements IProductService {
	@Autowired
	ProductsDao productsdao;

	public List<ProductDto> hienthibyidcategory(int id) {
		// TODO Auto-generated method stub
		return productsdao.getDataproductByidcategory(id);
	}

	public ProductDto hienthiproductbyid(int id) {
		// TODO Auto-generated method stub
		return productsdao.getDataproductByid(id);
	}

	public List<ProductDto> hienthiproductnew() {
		// TODO Auto-generated method stub
		return productsdao.getnewproduct();
	}

	public List<ProductDto> hienthiproductmany() {
		// TODO Auto-generated method stub
		return productsdao.getdataproductmany();
	}

	public List<ProductDto> hienthitatcaproduct() {
		// TODO Auto-generated method stub
		return productsdao.getAllproduct();
	}
	public int themproduct(ProductDto product) {
		// TODO Auto-generated method stub
		return productsdao.themproduct(product);
	}
	public int suaproduct(ProductDto product) {
		// TODO Auto-generated method stub
		return productsdao.suaproduct(product);
	}
	public ProductDto layproducttuid(int id) {
		// TODO Auto-generated method stub
		return productsdao.layproducttuid(id);
	}
	public int xoaproduct(int id) {
		// TODO Auto-generated method stub
		return productsdao.xoaproduct(id);
	}

}
