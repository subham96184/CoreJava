package com.luv3code.java8Features.mapAndFlatterMap;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomerService {

	public static void main(String[] args) {
		
	
	List<Customer> customer=CustomerDAO.getAll();
	
	List<String> emaiList=customer.stream().map((customers) -> customers.getEmail()).collect(Collectors.toList());
	
	
	System.out.println(emaiList);
	
	 List<List<String>> phoneNumbersList= customer.stream().map(
			customers->customers.getPhoneNumbers()).collect(Collectors.toList());
	 
	 System.out.println(phoneNumbersList);
	}
}
