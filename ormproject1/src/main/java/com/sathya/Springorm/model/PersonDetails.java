package com.sathya.Springorm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {
	private int Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private int Age;
	
	

}
