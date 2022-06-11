package Doan.entity.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUser implements RowMapper<user> {

	public user mapRow(ResultSet rs, int rowNum) throws SQLException {
		user User= new user();
		User.setUsername(rs.getString("username"));
		User.setAddress(rs.getString("address"));
		User.setPassword(rs.getString("password"));
		User.setFullname(rs.getString("fullname"));
		User.setEmail(rs.getString("email"));
		User.setPhone(rs.getString("phone"));
		User.setId(rs.getInt("id"));
		return User;
	}

}
