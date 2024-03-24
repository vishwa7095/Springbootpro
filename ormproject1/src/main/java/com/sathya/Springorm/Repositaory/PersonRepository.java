package com.sathya.Springorm.Repositaory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.Springorm.Entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	

}
