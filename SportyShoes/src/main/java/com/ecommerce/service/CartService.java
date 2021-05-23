package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.CartDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Users;

@Service
public class CartService {

	
	@Autowired
	private CartDao cartDao;
	
	public boolean addCart(Cart aCart) {
		
		boolean isAdded = false;
		//statConn = false;
		if (cartDao.save(aCart) != null)
		{
			isAdded = true;
		}
		
		return isAdded;
	}
	
	public List<CartItem>loadItemInCartbyUser()
	{
		List<CartItem> aList = null;
		
		
		return aList;
	}
	
}
