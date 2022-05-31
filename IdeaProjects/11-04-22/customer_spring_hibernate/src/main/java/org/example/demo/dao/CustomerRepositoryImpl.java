package org.example.demo.dao;

import org.example.demo.config.SpringConfig;
import org.example.demo.entity.Customer;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

    private final org.hibernate.Session session;

    public CustomerRepositoryImpl() {
        super();
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SessionFactory sessionFactory = context.getBean("sf", SessionFactory.class);
        session = sessionFactory.openSession();
    }

    @Override
    public void createCustomer(Customer customer) throws SQLException {
        session.getTransaction().begin();
        session.save(customer);
        session.getTransaction().commit();

        System.out.println("Customer created successfully...");
    }

    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        //session.getTransaction().begin();
        TypedQuery<Customer> query = session.createQuery("FROM Customer", Customer.class);

        return query.getResultList();
    }

    @Override
    public Customer getCustomerById(int id) throws SQLException {
        //session.getTransaction().begin();
        Customer customer = session.get(Customer.class, id);
       // session.getTransaction().commit();

        return customer;
    }

    @Override
    public List<Customer> getCustomerByFirstName(String firstName) throws SQLException {
        //session.getTransaction().begin();
        TypedQuery<Customer> query = session.createQuery("SELECT C FROM Customer C WHERE C.firstName = :fName", Customer.class);
        query.setParameter("fName", firstName);

        //session.getTransaction().commit();

        return query.getResultList();
    }

    @Override
    public void updateCustomerById(Customer customer) throws SQLException {
       // session.getTransaction().begin();
        session.update(customer);
        //session.getTransaction().commit();

        System.out.println("Customer " + customer.getCustomerId() + " updated successfully...");
    }

    @Override
    public void deleteCustomerById(int id) throws SQLException {
        //session.getTransaction().begin();
        Customer customer = (Customer) session.get(Customer.class, id);
        session.delete(customer);
       // session.getTransaction().commit();

        System.out.println("Customer No." + id + " deleted successfully...");
    }
}
