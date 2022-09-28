package com.eafonasyev.classes.implementation;

import com.eafonasyev.classes.dao.CustomerDAO;
import com.eafonasyev.classes.entety.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public List<Customer> getCustomers() {
        //get current session
        Session session = sessionFactory.getCurrentSession();
        //get query
        Query<Customer> customerQuery = session.createQuery("from Customer order by lastNmame",Customer.class);
        //get result
        List<Customer> customers = customerQuery.getResultList();

        return customers;
    }

    public Customer getCustomer(int id) {

        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class,id);

        return customer;
    }

    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);

    }

    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(id);
    }
}
