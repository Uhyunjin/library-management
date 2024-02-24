package com.project.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/registration")
    public String registration(String[] args) {
        return "registration";
    };

    @GetMapping("/customer")
    public String customer(String[] args) {
        return "customerList";
    };
}
