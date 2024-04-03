package com.project.library.controller;
import com.project.library.dao.ExDAO;
import com.project.library.domain.ExDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    ExDAO exDAO;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(String[] args) {
        return "registration";
    }

    @GetMapping("/customer")
    public String list(Model m, HttpServletRequest request) {
        try {
            List<ExDTO> list = exDAO.selectAll();
            m.addAttribute("list", list);
            System.out.println(list);
            
        } catch (Exception e) {
            e.printStackTrace();
            m.addAttribute("msg", "LIST_ERR");
            // m.addAttribute("totalCnt", 0);
        }

        return "customerList";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        return "save";
    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration() {
        return "registration";
    }
}
