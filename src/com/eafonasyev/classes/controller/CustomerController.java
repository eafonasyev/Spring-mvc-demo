package com.eafonasyev.classes.controller;

import com.eafonasyev.classes.dao.CustomerDAO;
import com.eafonasyev.classes.entety.Customer;
import com.eafonasyev.classes.service.CustomerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {
     //injection
     @Autowired
     public CustomerSevice customerSevice;

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
}
