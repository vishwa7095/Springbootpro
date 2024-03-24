package com.sathya.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.entity.Product;

public interface ProductRepositary extends JpaRepository<Product, Integer> {

} 
