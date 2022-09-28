package com.eafonasyev.classes.controller;

import com.eafonasyev.classes.dao.CustomerDAO;
import com.eafonasyev.classes.entety.Customer;
import com.eafonasyev.classes.implementation.CustomersServiceImpl;
import com.eafonasyev.classes.service.CustomerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
     //injection
     @Autowired
     private CustomerSevice customerSevice;

    @RequestMapping("/")
    String showPage(){
        return "main-menu";
    }

    @GetMapping("/list")
    public String listCustomers(Model model){
        //get customers  from injections
        List<Customer> customers = customerSevice.getCustomers();
        //add to model
        model.addAttribute("customers",customers);
        //return page
        return "list-customers";
    }
    @RequestMapping("/showFormForAdd")
    public String showFormForAddr(Model model){
        Customer customer = new Customer();

        model.addAttribute("customer", customer);

        return "customer-form";
    }
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerSevice.saveCustomer(customer);

        return "redirect:/customers/list";
    }

    @RequestMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId, Model model){
        Customer customer = customerSevice.getCustomer(theId);
        model.addAttribute("customer",customer);
        return "customer-form";

    }


    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        int id = customer.getId();
        customerSevice.deleteCustomer(id);
        return "redirect:/customers/list";
    }
}
