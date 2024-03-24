package com.sathya.SpringDataJpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class productDetails {
	private int proId;
	private String proName;
	private double proPrice;


}
