package Doan.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.UserDao;
import Doan.entity.user.user;
@Service
public class IPLMUserService implements IuserService {
	@Autowired
	UserDao userdao;

	public int dangky(user User) {
		// TODO Auto-generated method stub
		return userdao.dangky(User);
	}

	public user dangnhap(user User) {
		// TODO Auto-generated method stub
		return userdao.kiemtradangnhap(User);
	}

	public List<user> laytatcauser() {
		// TODO Auto-generated method stub
		return userdao.laytatcauser();
	}

}
