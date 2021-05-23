package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.model.Users;

@Service
public class ProductService {

ArrayList<Users> al= new ArrayList<Users>();
	
	@Autowired
	private ProductDao productDao;
	
	

	public boolean AddProduct(String designProd, int unitPricProd, Category category, String apicture) {
		
		boolean isAdded = false;

		if (productDao.save(new Product(designProd, unitPricProd, category, apicture)) != null)
		{
			isAdded = true;
		}
		
		return isAdded;
	}
	
	
	public List<Product> loadProduct(){
		
		List al=(ArrayList<Product>) productDao.findAll();
		
		return al;
	}
	
	
	public List<Product> loadAllProduct(){
		
		List<Product> al= (List<Product>) productDao.findAll();
		
		return al;
	}
	
	

	//find product by id
	public boolean findProduct(Integer idProduct) {
		
		Optional<Product> find=productDao.findById(idProduct);
		
		if(find.isPresent()) {
			//System.out.println(find);
			return true;
		}
		
		return false;
	}

	
	public boolean deleteProduct(Integer idProduct) {
		
		Optional<Product> find = productDao.findById(idProduct);
		
		if(find.isPresent()) {
			productDao.deleteById(idProduct);
			return true;
		}
		
		
		return false;
	}
	
}
