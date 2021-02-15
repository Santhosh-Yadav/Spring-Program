package com.cfurd.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cfurd.sb.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	

}
