package Doan.Dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import Doan.Dto.user.MapperProductDto;
import Doan.Dto.user.ProductDto;
import Doan.entity.user.Bill;

@Repository
public class ProductsDao extends BaseDao {
	private StringBuffer stringbase() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM `product` p INNER JOIN `category` c ON p.category_id = c.id  ");
		return sql;
	}
	public List<ProductDto> getDataproductByidcategory(int id){
		StringBuffer sql = stringbase();
		sql.append(" WHERE c.id = "+id);
		List<ProductDto> list = _jdbctemplate.query(sql.toString(), new MapperProductDto());
		return list;
	}
	public List<ProductDto> getnewproduct(){
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from `product` p  ORDER BY id DESC limit 3");
		List<ProductDto> list = _jdbctemplate.query(sql.toString(), new MapperProductDto());
		
		return list;
	}
	public List<ProductDto> getAllproduct(){
		
		StringBuffer sql = new StringBuffer();
		sql.append("select *  from `product` p ");
		List<ProductDto> list = _jdbctemplate.query(sql.toString(), new MapperProductDto());
		
		return list;
	}
	public ProductDto getDataproductByid(int id) {
		StringBuffer sql = stringbase();
		sql.append("WHERE p.id =" + id);
		ProductDto item =  _jdbctemplate.queryForObject(sql.toString(), new MapperProductDto());
		return item;
	}
	public List<ProductDto> getdataproductmany() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT  DISTINCT p.name, p.id, p.price,p.imge_url,p.description,p.quantity,p.category_id FROM `product` p INNER JOIN `cart_detail`  limit 6");
		List<ProductDto> list = _jdbctemplate.query(sql.toString(), new MapperProductDto());
		return list;
	}
	public int themproduct(ProductDto product) {
		String sql = "INSERT INTO `product`(`name`, `price`, `quantity`, `description`, `imge_url`, `category_id`) VALUES ('"+product.getName()+"','"+product.getPrice()+"','"+product.getQuantity()+"','"+product.getDescription()+"','"+product.getImge_url()+"','"+product.getCategory_id()+" ')";
		return _jdbctemplate.update(sql);
	}
	public int suaproduct(ProductDto product) {
		String sql = "UPDATE `product` SET `id`='"+product.getId()+"',`name`='"+product.getName()+"',`price`='"+product.getPrice()+"',`quantity`='"+product.getQuantity()+"',`description`='"+product.getDescription()+"',`imge_url`='"+product.getImge_url()+"',`category_id`='"+product.getCategory_id()+"' WHERE id="+ product.getId();
		return _jdbctemplate.update(sql);
	}
	public ProductDto layproducttuid(int id) {
		
		String sql= "select * from `product` where id =" +id;
		ProductDto item =  _jdbctemplate.queryForObject(sql.toString(), new MapperProductDto());
		return item;
	}
	public int xoaproduct(int id) {
		String sql = "DELETE FROM `product` WHERE id="+ id;
		return _jdbctemplate.update(sql);
	}

	
	

}
