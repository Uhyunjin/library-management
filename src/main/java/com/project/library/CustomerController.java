package com.project.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(String[] args) {
        return "registration";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String customer(String[] args) {
        return "customerList";
    }

//    @RequestMapping(value = "/payment", method = RequestMethod.GET)
//    public String payment(String[] args) {
//        return "payment";
//    }
//
//    @RequestMapping(value = "/rent", method = RequestMethod.GET)
//    public String rentList(String[] args) {
//        return "rentList";
//    }
}
