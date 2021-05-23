package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.CategoryDao;
import com.ecommerce.model.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	public boolean AddCategory(String desigCategory)
	{
		boolean isAdded = false;
		
		if(categoryDao.save(new Category(desigCategory))!= null)
		{
			isAdded = true;
		}
		
		return isAdded;
	}
}
