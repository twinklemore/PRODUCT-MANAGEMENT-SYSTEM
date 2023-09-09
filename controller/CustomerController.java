package com.company.controller;

import com.company.dto.Customer;
import com.company.service.CustomerService;

public class CustomerController {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setId(31);
		customer.setName("louis");
		customer.setEmail("louis@mail.com");
		
		CustomerService customerservice=new CustomerService();
		Customer c=customerservice.saveCustomer(customer);

	
	if(c!=null) {
	System.out.println(c.getId()+" saved customer successfully");
	System.out.println("****************************");
	}
	
	if(c!=null) {
	System.out.println(c.getId()+" retrievd customer successfully");
	System.out.println("****************************");
	
}
	if(c!=null) {
	System.out.println(c.getEmail()+" retrievd all customers successfully");
	System.out.println("****************************");
	}
	if(c!=null) {
		System.out.println(c.getId()+" deleted customer successfully");
		System.out.println("****************************");
	}

	if(c!=null) {
		System.out.println(c.getEmail()+" updated customer successfully");
		System.out.println("****************************");
	
}
	}
}
