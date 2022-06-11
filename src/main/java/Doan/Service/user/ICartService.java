package Doan.Service.user;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import Doan.Dto.user.CartDTO;

@Service
public interface ICartService {
	public HashMap<Integer, CartDTO> addcart(int id, HashMap<Integer, CartDTO> cart, int soluong);
	public double tongtien(HashMap<Integer, CartDTO> cart);
	public int tongsoluong(HashMap<Integer, CartDTO> cart);
	public HashMap<Integer, CartDTO> delete(HashMap<Integer, CartDTO> cart,int id);
	public HashMap<Integer, CartDTO> edit(HashMap<Integer, CartDTO> cart,int id,int soluong);

}
