package com.cfurd.sb.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cfurd.sb.helper.CsvHelper;
import com.cfurd.sb.model.Customer;
import com.cfurd.sb.repository.CustomerRepository;


@Service
public class CsvService {
	
  @Autowired
  CustomerRepository repository;

  public void save(MultipartFile file) {
    try {
      List<Customer> customer = CsvHelper.csvToCustomers(file.getInputStream());
      repository.saveAll(customer);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }
  
} 