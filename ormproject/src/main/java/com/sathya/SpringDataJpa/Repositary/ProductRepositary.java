package com.sathya.SpringDataJpa.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.SpringDataJpa.entity.Product;


public interface ProductRepositary extends JpaRepository<Product, Integer> {
	 

}
