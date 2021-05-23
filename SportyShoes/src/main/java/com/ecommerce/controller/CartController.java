package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Users;
import com.ecommerce.service.CartService;
import com.ecommerce.service.UsersService;

@RestController
@RequestMapping("/cartcontroller")
public class CartController {

	@Autowired
	private CartService cartService;

	@PostMapping("/cart/addtocart")
	public String addtocart(@RequestParam("aUser") Users userId, @RequestParam("aTotalprice") Double totprice)
	{
		List<CartItem> cartItem = null;
		
		Cart aCart = new Cart(userId,cartItem,totprice);
		if (cartService.addCart(aCart)) {
			return "Login Successfull";
		}
		return "login Failed";
	}
}
