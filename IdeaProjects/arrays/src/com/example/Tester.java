package com.example;

public class Tester {

    public static void main(String[] args) {

        Customer customer=new Customer("c1","aa",CustomerType.REGULAR);
        Customer customer2=new Customer("c1","aa",CustomerType.REGULAR);

        System.out.println(customer==customer2);
        System.out.println(customer.equals(customer2));
        System.out.println(customer);
        System.out.println(customer2);
    }

}