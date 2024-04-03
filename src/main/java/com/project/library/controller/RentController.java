package com.project.library.controller;

import com.project.library.dao.RentDao;
import com.project.library.domain.RentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class RentController {
    @Autowired
    RentDao rentDao;

    @RequestMapping(value = "/payment", method = RequestMethod.GET)
    public String payment(String[] args) {
        return "payment";
    }

    @RequestMapping(value = "/rent", method = RequestMethod.GET)
    public String rentList(Model m) {
        try {
        List<RentDto> list = rentDao.selectAll();
            m.addAttribute(list);
            System.out.println(list);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "rentList";
    }
}
