package Doan.Dto.user;

public class ProductDto {
	private int id;
	private String name;
	private long price;
	private int quantity;
	private String description;
	private String imge_url;
	private int category_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImge_url() {
		return imge_url;
	}
	public void setImge_url(String imge_url) {
		this.imge_url = imge_url;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public ProductDto() {
		super();
	}
	

}
