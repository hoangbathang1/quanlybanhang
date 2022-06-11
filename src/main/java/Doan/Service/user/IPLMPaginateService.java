package Doan.Service.user;

import org.springframework.stereotype.Service;

import Doan.Dto.user.paginateDTO;
@Service
public class IPLMPaginateService implements IPaginateService {
    private	int totalpage,start,end;
	private paginateDTO page = new paginateDTO();
    
	public paginateDTO hienthi(int hientai,int tongso,int limit) {
		this.totalpage = tongso/limit;
        
		if(tongso%limit!=0) {
			this.totalpage+=1;
		}
		this.start = (hientai-1)*limit+1;
		if(hientai*limit<=tongso) {
			this.end=this.start+limit-1;
		}
		else {
			this.end= tongso;
		}
		if(this.start==tongso) {
			this.end=this.start;
		}
		if(hientai>totalpage) {
			hientai=totalpage;
					
		}
		page.setEnd(end);
		page.setStart(start);
		page.setLimit(limit);
		page.setHientai(hientai);
		page.setTongso(totalpage);
		
		
		
		return page;
	}

}
