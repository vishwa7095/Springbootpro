package com.sathya.Springorm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.Springorm.Entity.Person;
import com.sathya.Springorm.Mapper.PersonMapper;
import com.sathya.Springorm.Repositaory.PersonRepository;
import com.sathya.Springorm.model.PersonDetails;
@Component
public class PersonClient implements CommandLineRunner{
	@Autowired
	PersonRepository personRepository;
	@Autowired
	PersonMapper personMapper;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		PersonDetails personDetails = new PersonDetails();
		personDetails.setFirstName("khasim");;
		personDetails.setLastName("valli");
		personDetails.setAge(20);
		personDetails.setEmail("kasim@gmail.com");
		
	   Person person = personMapper.modelToConversion(personDetails);
	   
	   personRepository.save(person);
	   
	  PersonDetails p1 = new PersonDetails();
       p1.setFirstName("vinodh");
       p1.setLastName("thatipally");
       p1.setAge(22);
       p1.setEmail("vinod@gmail.com");
       
       PersonDetails p2 = new PersonDetails();
       p2.setFirstName("vamsi krishna");
       p2.setLastName("nakka");
       p2.setAge(22);
       p2.setEmail("vamsik@gmail.com");
       
       PersonDetails  p3 = new PersonDetails();
       p3.setFirstName("vikas");
       p3.setLastName("merugu");
       p3.setAge(22);
       p3.setEmail("vikas@gmail.com");
		
       List<PersonDetails> personDetail = List.of(p1,p2,p3);
       
       
       List<Person>persons = personMapper.modelToEntityListConversion(personDetail);
       personRepository.saveAll(persons);
       
//       Optional<Person> p = personRepository.findById(1);
//       if(p.isPresent())
//       {
//    	   System.out.println("data is present");
//       }
//       else
//       {
//    	   System.out.println("data is not present");
//       }
//       
//       List<Person> prdts = personRepository.findAll();
//       System.out.println(prdts);
//       
//       System.out.println(personRepository.existsById(1));
//       
//       long Count = personRepository.count();
//       System.out.println(Count);
//       
      
		
	}

}
