package Doan.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.admin.dao.AdminDao;
import Doan.admin.entity.admin;
@Service
public class IPLMadminService implements IadminService {
    @Autowired
    AdminDao admin;
	public admin dangnhap(admin Admin) {
		
		return admin.kiemtradangnhap(Admin);
	}

}
