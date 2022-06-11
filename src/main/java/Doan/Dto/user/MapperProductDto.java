package Doan.Dto.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProductDto implements RowMapper<ProductDto> {

	public ProductDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDto item = new ProductDto();
		item.setId(rs.getInt("id"));
		item.setImge_url(rs.getString("imge_url"));
		item.setDescription(rs.getString("description"));
		item.setName(rs.getString("name"));
		item.setPrice(rs.getLong("price"));
		item.setQuantity(rs.getInt("quantity"));
		item.setCategory_id(rs.getInt("category_id"));
		return item;
	}

}
