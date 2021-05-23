package com.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;
import com.ecommerce.model.Users;

@Repository
public interface CartItemDao extends CrudRepository<CartItem, String>
{

	//@Query("select p.* from cart c, cartitem i, product p where c.cart_id = i.cart_id and i.product_id = p.id_product and c.customer_id = :aUserId")
	//List<Product> findProductInCartByIdUser(Integer aUserId);
}
