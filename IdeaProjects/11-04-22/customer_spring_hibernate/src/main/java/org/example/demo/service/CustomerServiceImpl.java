package org.example.demo.service;

import org.example.demo.dao.CustomerRepository;
import org.example.demo.dao.CustomerRepositoryImpl;
import org.example.demo.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        super();
        customerRepository = new CustomerRepositoryImpl();
    }

    @Override
    public void createCustomer(Customer customer) throws SQLException {
        customerRepository.createCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        return customerRepository.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int id) throws SQLException {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public List<Customer> getCustomerByFirstName(String firstName) throws SQLException {
        return customerRepository.getCustomerByFirstName(firstName);
    }

    @Override
    public void updateCustomerById(Customer customer) throws SQLException {
        customerRepository.updateCustomerById(customer);
    }

    @Override
    public void deleteCustomerById(int id) throws SQLException {
        customerRepository.deleteCustomerById(id);
    }
}
