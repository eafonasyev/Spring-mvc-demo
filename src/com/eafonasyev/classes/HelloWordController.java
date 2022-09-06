package com.eafonasyev.classes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/main")
public class HelloWordController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }
    @RequestMapping("/processFormVersionTwo")
    public String processFormTwo(HttpServletRequest request, Model model){
        String theName = (String) request.getParameter("studentName");
        theName.toUpperCase();
        String result = "YOOO  "+ theName;
        model.addAttribute("message",result);
        return "helloWorld";
    }
    @RequestMapping("/processFormVersionTree")
    public String processFormTree(@RequestParam("studentName") String theName, Model model){
        theName.toUpperCase();
        String result = "YOOO777  "+ theName;
        model.addAttribute("message",result);
        return "helloWorld";
    }

}
