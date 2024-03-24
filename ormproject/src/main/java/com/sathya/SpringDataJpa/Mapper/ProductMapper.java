package com.sathya.SpringDataJpa.Mapper;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sathya.SpringDataJpa.entity.Product;
import com.sathya.SpringDataJpa.model.productDetails;

@Component
public class ProductMapper {
	public Product modelToConversion(productDetails productDetails)
	{
		Product product=new Product();
		product.setProId(productDetails.getProId());
		product.setProName(productDetails.getProName());
		product.setProPrice(productDetails.getProPrice());
		product.setCreateBy(System.getProperty("user.name"));
		product.setCreateAt(LocalDateTime.now());
		
		return product;

}
	public List<Product> modelToEntityListConversion(List<productDetails>productDetails)
	{
		List<Product> products = new ArrayList<>();
		
		for(productDetails productdDetail : productDetails)
		{
			Product p = new Product();
			p.setProId(productdDetail.getProId());
			p.setProName(productdDetail.getProName());
			p.setProPrice(productdDetail.getProPrice());
			p.setCreateBy(System.getProperty("user.name"));
			p.setCreateAt(LocalDateTime.now());
			products.add(p);
		}
		return products;
	}

}
