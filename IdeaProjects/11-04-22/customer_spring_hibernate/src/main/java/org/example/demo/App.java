package org.example.demo;


import org.example.demo.entity.Customer;
import org.example.demo.service.CustomerService;
import org.example.demo.service.CustomerServiceImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        final Scanner sc = new Scanner(System.in);

        CustomerService customerService = new CustomerServiceImpl();

        try {
            int choice = 0;

            do {
                System.out.println("1. Create Customer.");
                System.out.println("2. Get all Customers.");
                System.out.println("3. Get Customer by ID.");
                System.out.println("4. Get Customer by First Name.");
                System.out.println("5. Update Customer by ID.");
                System.out.println("6. Delete Customer by ID.");
                System.out.println("0. Exit the application.");
                System.out.println();
                System.out.print("Enter Your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Customer customer = new Customer();
                        System.out.print("Enter first name: ");
                        customer.setFirstName(sc.next());
                        System.out.print("Enter last name: ");
                        customer.setLastName(sc.next());
                        System.out.print("Enter email: ");
                        customer.setEmail(sc.next());
                        customerService.createCustomer(customer);
                        break;

                    case 2:
                        List<Customer> list = customerService.getAllCustomers();
                        for (Customer c : list) {
                            System.out.println(c);
                        }
                        break;

                    case 3:
                        System.out.print("Enter Customer ID to be fetched: ");
                        Customer customer1 = customerService.getCustomerById(sc.nextInt());
                        System.out.println();
                        if (customer1 == null) {
                            System.out.println("Customer not found...");
                        } else {
                            System.out.println("Customer found:- " + customer1);
                        }
                        break;

                    case 4:
                        System.out.print("Enter first name: ");
                        List<Customer> c_list = customerService.getCustomerByFirstName(sc.next());
                        System.out.println();
                        if (c_list == null) {
                            System.out.println("Customer not found...");
                        } else {
                            System.out.println("Customer found:- " );
                            for (Customer c : c_list) {
                                System.out.println(c_list);
                            }
                        }
                        break;

                    case 5:
                        System.out.print("Enter ID of Customer to be updated: ");
                        int id = sc.nextInt();
                        System.out.println();
                        Customer customer3 = customerService.getCustomerById(id);
                        if (customer3 == null) {
                            System.out.println("There is no pre-existing Customer with this ID...");
                        } else {
                            System.out.print("Enter First name: ");
                            customer3.setFirstName(sc.next());
                            System.out.print("Enter Last name: ");
                            customer3.setLastName(sc.next());
                            System.out.print("Enter email: ");
                            customer3.setEmail(sc.next());

                            customerService.updateCustomerById(customer3);
                        }
                        break;

                    case 6:
                        System.out.print("Enter Customer ID to be Deleted: ");
                        int id1 = sc.nextInt();
                        System.out.println();
                        Customer customer4 = customerService.getCustomerById(id1);
                        if (customer4 == null) {
                            System.out.println("No such Customer Found...");
                        } else {
                            customerService.deleteCustomerById(id1);
                        }
                        break;

                    case 0:
                        System.out.println("Leaving app...");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                        break;

                }

            } while (choice != 0);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
