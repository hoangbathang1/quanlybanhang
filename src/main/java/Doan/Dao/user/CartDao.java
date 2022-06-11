package Doan.Dao.user;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Doan.Dto.user.CartDTO;
import Doan.Dto.user.ProductDto;

@Repository
public class CartDao extends BaseDao {
	@Autowired
	ProductsDao productdao;
	public HashMap<Integer, CartDTO> addCart(int id, HashMap<Integer, CartDTO> cart, int soluong ){
		ProductDto product = productdao.getDataproductByid(id);
		CartDTO itemcart = new CartDTO();
		if(cart != null && cart.containsKey(id)) {
			itemcart = cart.get(id);
			itemcart.setSoluong(itemcart.getSoluong()+soluong);
			itemcart.setTotal(itemcart.getSoluong()*itemcart.getProduct().getPrice());
			
		}
		else {
			itemcart.setProduct(product);
			itemcart.setSoluong(soluong);
			itemcart.setTotal(itemcart.getSoluong()*itemcart.getProduct().getPrice());
		}
		cart.put(id, itemcart);
		return cart;
	}
	public double tongtien(HashMap<Integer, CartDTO> cart) {
		int total = 0;
		for(Map.Entry<Integer, CartDTO> itemcart : cart.entrySet()) {
			total+=itemcart.getValue().getTotal();
		}
		
				
		return total;
	}
	
	public int tongsoluong(HashMap<Integer, CartDTO> cart) {
		int soluong=0;
		for(Map.Entry<Integer, CartDTO> itemcart : cart.entrySet()) {
			soluong++;
		}
		return soluong;
	}
	public HashMap<Integer, CartDTO> delete(HashMap<Integer, CartDTO> cart, int id){
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
		
	}
	public HashMap<Integer,CartDTO> edit(HashMap<Integer, CartDTO> cart,int id, int soluong){
		CartDTO item = new CartDTO();
		if(cart ==null) {
			return cart;
		}
		if(cart.containsKey(id)) {
			item = cart.get(id);
			item.setSoluong(soluong);
			item.setTotal(item.getProduct().getPrice()*item.getSoluong());
		}
		cart.put(id, item);
		return cart;
	}

}
