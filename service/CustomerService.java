package com.company.service;

import com.company.dao.Customerdao;
import com.company.dto.Customer;

public class CustomerService {
	Customerdao customerdao=new Customerdao();

	public Customer saveCustomer(Customer customer) {
		return customerdao.saveCustomer(customer);
		// TODO Auto-generated method stub
		
	}
	public void retrieveCustomer() {
		customerdao.retrieveCustomer();
	}
	public void retrieveallCustomers() {
		customerdao.retrieveallCustomers();
	}
	public boolean deleteCustomerbyId(int id) {
		return true;

}
	public boolean updateCustomerEmailbyName(int id,String Name) {
		return true;
	}
}
