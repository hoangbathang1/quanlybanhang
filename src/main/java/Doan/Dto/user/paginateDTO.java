package Doan.Dto.user;

public class paginateDTO {
	private int start;
	private int end;
	private int limit;
	private int hientai;
	private int tongso;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getHientai() {
		return hientai;
	}
	public void setHientai(int hientai) {
		this.hientai = hientai;
	}
	public int getTongso() {
		return tongso;
	}
	public void setTongso(int tongso) {
		this.tongso = tongso;
	}
	public paginateDTO() {
		super();
	}

}
