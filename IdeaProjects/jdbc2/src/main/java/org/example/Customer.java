package org.example;

import org.example.demo.CustomerRepository;

public class Customer {
    private int customerId;
    String first_name;
    String last_name;
    String email;

    public Customer() {
        super();
    }

    public Customer(int customerId, String first_name, String last_name, String email) {
        this.customerId = customerId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
