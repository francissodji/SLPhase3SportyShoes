package com.ecommerce.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>
{


}
