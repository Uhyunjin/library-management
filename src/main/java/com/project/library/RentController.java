package com.project.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentController {
    @GetMapping("/payment")
    public String payment(String[] args) {
        return "payment";
    }
    @GetMapping("/rentlist")
    public String rentList(String[] args) {
        return "rentList";
    }
}
