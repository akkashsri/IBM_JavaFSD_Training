package org.example.demo;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public void getAllCustomers(List l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
