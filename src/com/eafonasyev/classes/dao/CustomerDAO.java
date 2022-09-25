package com.eafonasyev.classes.dao;

import com.eafonasyev.classes.entety.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public Customer getCumer();


}
