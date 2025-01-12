 package com.sathya.SpringDataJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.SpringDataJpa.Mapper.ProductMapper;
import com.sathya.SpringDataJpa.Repositary.ProductRepositary;
import com.sathya.SpringDataJpa.entity.Product;
import com.sathya.SpringDataJpa.model.productDetails;

@Component
public class ProductClient implements CommandLineRunner {

    @Autowired
    ProductRepositary productRepositary;

    @Autowired
    ProductMapper mapper;

    @Override
    public void run(String... args) throws Exception {
        productDetails productDetails = new productDetails();
        productDetails.setProId(101);
        productDetails.setProName("cornflakes");
        productDetails.setProPrice(180);

        // Conversion of model class data to entity using ModelMapper:
        Product product=mapper.modelToConversion(productDetails);

        // Save the product entity using your repository
        productRepositary.save(product);
        
        productDetails p1 = new productDetails() ;
        p1.setProId(102);
        p1.setProName("sugar");
        p1.setProPrice(100);
        
        productDetails p2 = new productDetails();
        p2.setProId(103);
        p2.setProName("honey");
        p2.setProPrice(320);
        
        productDetails p3 = new productDetails();
        p3.setProId(104);
        p3.setProName("perfumes");
        p3.setProPrice(180);
        
        
        List<productDetails> produDetails = List.of(p1,p2);
        
        
        //conversion process:
        List<Product>products = mapper.modelToEntityListConversion(produDetails);
        productRepositary.saveAll(products);
        
        Optional<Product>p = productRepositary.findById(111);
        if(p.isPresent())
        {System.out.println("record is present");
        }
        else
        {
        	System.out.println("record is not available");
        }
        
        List<Product> prdts = productRepositary.findAll();
        System.out.println(prdts);
        
        System.out.println(productRepositary.existsById(111));
        
        long Count = productRepositary.count();
        System.out.println(Count);
        
        productRepositary.deleteById(111);
       
           
        
    }
}
