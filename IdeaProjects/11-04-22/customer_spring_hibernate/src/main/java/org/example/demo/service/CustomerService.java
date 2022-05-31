package org.example.demo.service;

import org.example.demo.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    public void createCustomer(Customer customer) throws SQLException;
    public List<Customer> getAllCustomers() throws SQLException;
    public Customer getCustomerById(int id) throws SQLException;
    public List<Customer> getCustomerByFirstName(String firstName) throws SQLException;
    public void updateCustomerById(Customer customer) throws SQLException;
    public void deleteCustomerById(int id) throws SQLException;
}
