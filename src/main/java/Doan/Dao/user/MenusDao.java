package Doan.Dao.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Doan.entity.user.MapperMenu;
import Doan.entity.user.Menu;

@Repository
public class MenusDao extends BaseDao {
	public List<Menu> hienthi(){
		List<Menu> list = new ArrayList<Menu>();
		String sql  = "select * from menus";
		list = _jdbctemplate.query(sql,new MapperMenu());
		return list;
	}

}
