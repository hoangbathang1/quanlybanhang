package Doan.Service.user;

import org.springframework.stereotype.Service;

import Doan.Dto.user.paginateDTO;

@Service
public interface IPaginateService {
	public paginateDTO hienthi(int hientai,int tongso,int limit);

}
