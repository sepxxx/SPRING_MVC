package com.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
    @RequestMapping("/askEmployeeName")
    public String askEmployeeName() { return "ask-employee-name-view";}


//    @RequestMapping("/showEmployeeName")
//    public String showEmployeeName() { return "show-employee-name-view";}
//    @RequestMapping("/showEmployeeName")
//    public String showEmployeeName(HttpServletRequest httpServletRequest, Model model) {
//        String name = httpServletRequest.getParameter("employeeName");
//        name = "Mr. " + name;
//        model.addAttribute("employeeNameAttribute", name);
//        model.addAttribute("descriptionAttribute", " is a student");
//        return "show-employee-name-view";
//    }

    @RequestMapping("/showEmployeeName")
    public String showEmployeeName(@RequestParam("employeeName") String name, Model model) {
//        String name = httpServletRequest.getParameter("employeeName");
        name = "Mr. " + name;
        model.addAttribute("employeeNameAttribute", name);
        model.addAttribute("descriptionAttribute", " is a student");
        return "show-employee-name-view";
    }
}
