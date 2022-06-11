package Doan.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.entity.user.Menu;
@Service
public interface IMenusService {
	public List<Menu> hienthi();
		

}
