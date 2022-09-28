package com.eafonasyev.classes.dao;
import com.eafonasyev.classes.entety.Customer;


import java.util.List;

public interface CustomerDAO {

     List<Customer> getCustomers();

     Customer getCustomer(int id);

     void saveCustomer(Customer customer);

     void deleteCustomer(int id);
}

