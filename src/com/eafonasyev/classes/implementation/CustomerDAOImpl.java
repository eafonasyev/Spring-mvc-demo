package com.eafonasyev.classes.implementation;

import com.eafonasyev.classes.dao.CustomerDAO;
import com.eafonasyev.classes.entety.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public List<Customer> getCustomers() {
        //get current session
        Session session = sessionFactory.getCurrentSession();
        //get query
        Query<Customer> customerQuery = session.createQuery("from Customer",Customer.class);
        //get result
        List<Customer> customers = customerQuery.getResultList();

        return customers;
    }

    public Customer getCustomer() {
        return null;
    }
}
