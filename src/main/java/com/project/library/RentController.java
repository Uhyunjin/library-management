package com.project.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RentController {
    @RequestMapping(value = "/payment", method = RequestMethod.GET)
    public String payment(String[] args) {
        return "payment";
    }

    @RequestMapping(value = "/rent", method = RequestMethod.GET)
    public String rentList(String[] args) {
        return "rentList";
    }
}
