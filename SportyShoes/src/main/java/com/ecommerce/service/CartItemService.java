package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.CartItemDao;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;

@Service
public class CartItemService {

	
	@Autowired
	private CartItemDao cartItemDao;
	
	
	public boolean addCart(CartItem aCartItem) {
		
		boolean isAdded = false;
		//statConn = false;
		if (cartItemDao.save(aCartItem) != null)
		{
			isAdded = true;
		}
		
		return isAdded;
	} 
	
	
}
