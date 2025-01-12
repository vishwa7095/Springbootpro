package com.sathya.SpringDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.sathya.Mapper.productMapper;
import com.sathya.Model.ProductDetails;
import com.sathya.Repository.ProductRepositary;
import com.sathya.entity.Product;
public class ProductClient implements CommandLineRunner{
	 
	@Autowired
	ProductRepositary productRepositary;
	
	@Autowired
	productMapper mapper;

	@Override
	public void run(String... args) throws Exception {
	//model class data having the values:
		ProductDetails productDetails =new ProductDetails();
		productDetails.setProId(1001);
		productDetails.setProName("sugar");
		productDetails.setProPrice(220);
		
		//conversion of model class data to entity:
		Product product=mapper.modelToConversion(productDetails);
		
		
	}

}
