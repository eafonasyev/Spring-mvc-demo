package com.eafonasyev.classes.controller;

import com.eafonasyev.classes.dao.CustomerDAO;
import com.eafonasyev.classes.entety.Customer;
import com.eafonasyev.classes.service.CustomerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        model.addAttribute("customer",customers);
        //return page
        return "list-cuatomers";
    }
}
