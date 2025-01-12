package com.sathya.Springorm.Mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sathya.Springorm.Entity.Person;
import com.sathya.Springorm.model.PersonDetails;
@Component
public class PersonMapper {
	public Person modelToConversion(PersonDetails personDetails)
	{
		Person person = new Person();
		person.setId(personDetails.getId());
		person.setFirstName(personDetails.getFirstName());
		person.setLastName(personDetails.getLastName());
		person.setEmail(personDetails.getEmail());
		person.setAge(personDetails.getAge());
		person.setCreatedBy(System.getProperty("user.name"));
		person.setCreateAt(LocalDateTime.now());
		
		return person;
	}
	
	 public List<Person> modelToEntityListConversion(List<PersonDetails>personDetails)
	 {
		 List<Person> persons = new ArrayList<>();
		 
		 for(PersonDetails personDetail : personDetails)
		 {
			 Person person =new Person();
			 person.setId(personDetail.getId());
			person.setFirstName(personDetail.getFirstName());
		    person.setLastName(personDetail.getLastName());
		    person.setEmail(personDetail.getEmail());
		    person.setAge(personDetail.getAge());
		    person.setCreatedBy(System.getProperty("user.name"));
			 person.setCreateAt(LocalDateTime.now());
		 }
		 return persons;
	 }
	 
}
