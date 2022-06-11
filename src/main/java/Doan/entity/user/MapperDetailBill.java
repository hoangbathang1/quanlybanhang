package Doan.entity.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDetailBill  implements RowMapper<DetailBills>{

	public DetailBills mapRow(ResultSet rs, int rowNum) throws SQLException {
		DetailBills item = new DetailBills();
		item.setCart_id(rs.getInt("cart_id"));
		item.setId(rs.getInt("id"));
		item.setPrice(rs.getDouble("price"));
		item.setProduct_id(rs.getInt("product_id"));
		item.setProduct_quantity(rs.getInt("product_quantity"));
		return item;
	}

}
