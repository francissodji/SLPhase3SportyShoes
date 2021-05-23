package com.ecommerce.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.general.FileUploadUtil;
import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/productmain")
public class ProductMain {

	@Autowired
	private ProductService productService;
	

	
	@PostMapping("/AddProduct")
	public RedirectView  saveProduct(@RequestParam("aProddesign") String prodDesign, @RequestParam("aProdUnitprice") int unitprice, 
			@RequestParam("aProdCategory") Category aProdCateg, @RequestParam("image") MultipartFile  multipartFile)
	{

		String picturefileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		
		//Product aProduct = new Product(prodDesign, unitprice, aProdCateg, picturefileName);
		
		productService.AddProduct(prodDesign, unitprice, aProdCateg, picturefileName);
		
		
		String uploadDir = "pictures/file1" ;
		 
        try {
        	
			FileUploadUtil.saveFile(uploadDir, picturefileName, multipartFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return new RedirectView("/addproduct", true);
	}
	

	@RequestMapping("/getAllProducts") 
	public ModelAndView getAllProducts()
	{
		  List<Product> products = productService.loadAllProduct(); 
		  return new ModelAndView("/productList", "products", products); 
	}
	
}
