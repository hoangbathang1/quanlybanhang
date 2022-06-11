package Doan.entity.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDoanhthu implements RowMapper<doanhthu> {
	public doanhthu mapRow(ResultSet rs, int rowNum) throws SQLException {
		doanhthu doanhthu = new doanhthu();
		doanhthu.setDoanhthu(rs.getDouble("doanhthu"));
		return doanhthu;
	}

}
