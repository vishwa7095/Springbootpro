package com.sathya.SpringDataJpa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	 @Id
		private int proId;
		private String proName;
		private double proPrice;
		
		private  LocalDateTime createAt;
		private String createBy;
}
