package Doan.Service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import Doan.entity.user.user;

@Service
public interface IuserService {
	public int dangky(user User);
	public user dangnhap(user User);
	public List<user> laytatcauser();

}
