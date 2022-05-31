package org.example;

import org.example.demo.CustomerRepository;
import org.example.demo.CustomerRepositoryImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try {

            //load the driver
            DriverManager.registerDriver(new org.h2.Driver());
            //second step

            Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
            System.out.println("connection sucessfull: "+connection);
            DatabaseMetaData s = connection.getMetaData();
            System.out.println(s.getDatabaseProductName());
            Statement statement= connection.createStatement();
            ResultSet resultSet=    statement.executeQuery("SELECT CUSTOMERID, FIRST_NAME, LAST_NAME, EMAIL FROM CUSTOMER ");
            List<Customer> list = new ArrayList<Customer>();
            while(resultSet.next())
            {
                int customerId = resultSet.getInt(1);
                String first_name = resultSet.getString(2);
                String last_name = resultSet.getString(3);
                String email = resultSet.getString(4);
                list.add(new Customer(customerId, first_name, last_name, email));
            }
            CustomerRepository c = new CustomerRepositoryImpl();
            c.getAllCustomers(list);


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}