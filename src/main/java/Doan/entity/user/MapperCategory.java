package Doan.entity.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategory implements RowMapper<Category> {

	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category item = new Category();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		return item;
	}

}
