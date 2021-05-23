package com.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Category;

@Repository
public interface CategoryDao extends CrudRepository<Category, Integer>
{

}
