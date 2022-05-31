package org.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.demo.config.MySqlConfig;
import org.example.demo.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	private  MySqlConfig mySqlConfig;

	Scanner sc = new Scanner(System.in);
	

	public CustomerRepositoryImpl() {
		mySqlConfig=MySqlConfig.createMySqlConfig();
	}




	@Override
	public void createCustomer(Customer customer) throws SQLException {
		Connection connection=mySqlConfig.getMyConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into customer(first_name,last_name,email) values(?,?,?)");
		preparedStatement.setString(1, customer.getFirstName());
		preparedStatement.setString(2, customer.getLastName());
		preparedStatement.setString(3, customer.getEmail());
		preparedStatement.executeUpdate();
		System.out.println("customer created sucessfully...");
		
	}




	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		List<Customer> list=new ArrayList<Customer>();
		Connection connection=mySqlConfig.getMyConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select customerId, first_name,last_name,email from customer");
		while(resultSet.next())
		{
			Customer customer=new Customer();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setFirstName(resultSet.getString(2));
			customer.setLastName(resultSet.getString(3));
			customer.setEmail(resultSet.getString(4));
			list.add(customer);
			
		}
		return list;
	}




	@Override
	public Customer getCustomerById(int id) throws SQLException{
		List<Customer> list=new ArrayList<Customer>();
		Connection connection=mySqlConfig.getMyConnection();
		PreparedStatement pstatement=connection.prepareStatement("select customerId, first_name,last_name,email from customer where customerId=?");
		pstatement.setInt(1, id);
		ResultSet resultSet= pstatement.executeQuery();
	
		while(resultSet.next())
		{
			Customer customer=new Customer();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setFirstName(resultSet.getString(2));
			customer.setLastName(resultSet.getString(3));
			customer.setEmail(resultSet.getString(4));
			list.add(customer);
			
		}
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}




	@Override
	public void updateCustomerFirstNameById(int id) throws SQLException {
		System.out.println("Enter New First Name: ");
		String fName = sc.next();
		Connection con = mySqlConfig.getMyConnection();
		PreparedStatement pst = con.prepareStatement("UPDATE customer SET First_Name = ? WHERE customerID = ?");
		pst.setString(1, fName);
		pst.setInt(2, id);

		pst.executeUpdate();

		System.out.println("Customer First Name updated successfully...");
	}

	@Override
	public void updateCustomerLastNameById(int id) throws SQLException {
		System.out.println("Enter New Last Name: ");
		String lName = sc.next();
		Connection con = mySqlConfig.getMyConnection();
		PreparedStatement pst = con.prepareStatement("UPDATE customer SET Last_Name = ? WHERE customerID = ?");

		pst.setString(1, lName);
		pst.setInt(2, id);

		pst.executeUpdate();

		System.out.println("Customer Last Name updated successfully...");
	}

	@Override
	public void updateCustomerEmailById(int id) throws SQLException {
		System.out.println("Enter New Email: ");
		String email = sc.next();
		Connection con = mySqlConfig.getMyConnection();
		PreparedStatement pst = con.prepareStatement("UPDATE customer SET Email = ? WHERE customerID = ?");

		pst.setString(1, email);
		pst.setInt(2, id);
		pst.executeUpdate();

		System.out.println("Customer email updated successfully...");
	}




	@Override
	public void deleteCustomerById(int id) throws SQLException{
		// TODO Auto-generated method stub
		Connection connection=mySqlConfig.getMyConnection();

		PreparedStatement preparedStatement=connection.prepareStatement("delete from customer where customerId = ?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();

	}

	
}
