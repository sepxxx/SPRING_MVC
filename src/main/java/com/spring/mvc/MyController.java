package com.spring.mvc;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
    @RequestMapping("/askEmployeeDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-employee-details-view";}

    @RequestMapping("/showEmployeeDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {

        if(bindingResult.hasErrors())
            return "ask-employee-details-view";

        return "show-employee-details-view";
    }
}
