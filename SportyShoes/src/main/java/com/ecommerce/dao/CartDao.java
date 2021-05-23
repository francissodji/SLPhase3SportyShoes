package com.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.model.Cart;
@Repository
public interface CartDao extends CrudRepository<Cart, String>
{

}
