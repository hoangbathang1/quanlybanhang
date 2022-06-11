package Doan.Service.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.CartDao;
import Doan.Dto.user.CartDTO;
@Service
public class IPLMCartService  implements ICartService{
    @Autowired
    CartDao cardao;
	public HashMap<Integer, CartDTO> addcart(int id, HashMap<Integer, CartDTO> cart, int soluong) {
		
		return cardao.addCart(id, cart, soluong);
	}
	public double tongtien(HashMap<Integer, CartDTO> cart) {
		return cardao.tongtien(cart);
	}
	public int tongsoluong(HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cardao.tongsoluong(cart);
	}
	public HashMap<Integer, CartDTO> delete(HashMap<Integer, CartDTO> cart, int id) {
		// TODO Auto-generated method stub
		return cardao.delete(cart, id);
	}
	public HashMap<Integer, CartDTO> edit(HashMap<Integer, CartDTO> cart, int id, int soluong) {
		// TODO Auto-generated method stub
		return cardao.edit(cart, id, soluong);
	}
	

}
