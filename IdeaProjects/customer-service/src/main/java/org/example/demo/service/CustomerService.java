package org.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.example.demo.model.Customer;

public interface CustomerService {
	public void createCustomer(Customer customer) throws SQLException;
public List<Customer> displayAllCustomers() throws SQLException;
	
	public Customer getCustomerById(int id) throws SQLException;

	public void updateCustomerFirstNameById(int id) throws SQLException;

	public void updateCustomerLastNameById(int id) throws SQLException;

	public void updateCustomerEmailById(int id) throws SQLException;
	
	public void deleteCustomerById(int id) throws SQLException;


}
