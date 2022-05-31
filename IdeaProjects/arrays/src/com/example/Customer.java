package com.example;

public class Customer extends Object{

    private String customerId;
    private String customerName;
    private CustomerType customerType;
    public Customer() {
        super();
    }
    public Customer(String customerId, String customerName, CustomerType customerType) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerType = customerType;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public CustomerType getCustomerType() {
        return customerType;
    }
    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
    @Override
    public boolean equals(Object obj) {
        Customer customer=(Customer)obj;
        if(this.getCustomerId()==customer.getCustomerId()&&(this.getCustomerName()==customer.getCustomerName()&&this.getCustomerType()==customer.getCustomerType()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString() {
        return "CustomerID: "+customerId+" Customer Name: "+customerName+" Customer Type: "+customerType;
    }
    @Override
    public int hashCode() {

        return super.hashCode();
    }



}