package com.eafonasyev.classes.service;
import com.eafonasyev.classes.entety.Customer;


import java.util.List;


public interface CustomerSevice {

     List<Customer> getCustomers();

     Customer getCustomer(int id);

     void saveCustomer(Customer customer);

     void deleteCustomer(int id);
}
