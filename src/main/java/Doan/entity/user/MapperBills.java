package Doan.entity.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBills implements RowMapper<Bill> {

	public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bill bill = new Bill();
		bill.setId(rs.getInt("id"));
		bill.setPrice(rs.getDouble("price"));
		bill.setStatus(rs.getString("status"));
		bill.setUser_id(rs.getInt("user_id"));
		bill.setCreate_date(rs.getTimestamp("create__date"));
		bill.setAddress(rs.getString("address"));
		bill.setEmail(rs.getString("email"));
		bill.setPhone(rs.getString("phone"));
		bill.setFullname(rs.getString("fullname"));
		return bill;
	}
	

}
