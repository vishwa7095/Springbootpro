package com.sathya.Mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.sathya.Model.ProductDetails;
import com.sathya.entity.Product;
@Component
public class productMapper {
	//this method taking model class as input & return entity class as output:
	public Product modelToConversion(ProductDetails productDetails)
	{
		Product product=new Product();
		product.setProId(productDetails.getProId());
		product.setProName(productDetails.getProName());
		product.setProPrice(productDetails.getProPrice());
		product.setCreateBy(System.getProperty("user.name"));
		product.setCreateAt(LocalDateTime.now());
		
		return product;
		
	}

}
