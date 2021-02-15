package com.cfurd.sb.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.cfurd.sb.model.Customer;

public class CsvHelper {
	  public static String TYPE = "text/csv";
	  static String[] HEADERs = { "id", "requestId", "name", "fatherName","dob","pan" };

	 
	  public static List<Customer> csvToCustomers(InputStream is) {
	    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        CSVParser csvParser = new CSVParser(fileReader,
	            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

	      List<Customer> customerList = new ArrayList<>();

	      Iterable<CSVRecord> csvRecords = csvParser.getRecords();

	      for (CSVRecord csvRecord : csvRecords) {
	    	  Customer customer = new Customer(
	              Long.parseLong(csvRecord.get("id")),
	              csvRecord.get("requestId"),
	              csvRecord.get("name"),
	              csvRecord.get("fatherName"),
	              csvRecord.get("dob"),
	              csvRecord.get("pan"));

	    	  customerList.add(customer);
	      }

	      return customerList;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
	    }
	  }
}
