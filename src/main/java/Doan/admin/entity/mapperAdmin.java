package Doan.admin.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class mapperAdmin implements RowMapper<admin> {

	public admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		admin Admin = new admin();
		Admin.setName(rs.getString("name"));
		Admin.setPassword(rs.getString("password"));
		return Admin;
	}

}
