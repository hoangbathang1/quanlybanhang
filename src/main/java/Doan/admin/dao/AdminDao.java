package Doan.admin.dao;

import org.springframework.stereotype.Repository;

import Doan.Dao.user.BaseDao;
import Doan.admin.entity.admin;
import Doan.admin.entity.mapperAdmin;
import Doan.entity.user.MapperUser;
import Doan.entity.user.user;

@Repository
public class AdminDao extends BaseDao {
	public admin kiemtradangnhap(admin Admin) {
		String sql ="SELECT * FROM `admin` WHERE name = '"+Admin.getName()+"' AND password = '"+Admin.getPassword()+"' ";
		admin item;
		try {
			 item = _jdbctemplate.queryForObject(sql, new mapperAdmin());
		} catch (Exception e) {
			return null;
		}
		return item;
		
		
	}

}
