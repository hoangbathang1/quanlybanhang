package Doan.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.MenusDao;
import Doan.entity.user.Menu;
@Service
public class ImplMenusService implements IMenusService {
    @Autowired
    MenusDao menusdao;
	public List<Menu> hienthi() {

		return menusdao.hienthi();
	}

}
