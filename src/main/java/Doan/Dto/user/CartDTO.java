package Doan.Dto.user;

public class CartDTO {
	private int soluong;
	private double total;
	private ProductDto product;
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public CartDTO() {
		super();
	}
	

}
