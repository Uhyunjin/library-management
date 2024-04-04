package com.project.library.controller;
import com.project.library.dao.CustomerDao;
import com.project.library.dao.ExDAO;
import com.project.library.domain.CustomerDto;
import com.project.library.domain.ExDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    ExDAO exDAO;
    @Autowired
    CustomerDao customerDao;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model m) {
        m.addAttribute("mode", "new");
        return "registration";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String customerList(Model m, HttpServletRequest request) {
        try {
//            List<ExDTO> list = exDAO.selectAll();
            List<CustomerDto> list = customerDao.selectAll();
            m.addAttribute("list", list);
//            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
            m.addAttribute("msg", "LIST_ERR");
            // m.addAttribute("totalCnt", 0);
        }
        return "customerList";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String customerEdit(Model m, Integer cust_no) {
        try {
            CustomerDto customerDto = customerDao.selectId(cust_no);
            m.addAttribute(customerDto);
            System.out.println("customerDto = " + customerDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "registration";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String customerEditPost() {
        try {
        } catch (Exception e) {
        }
        return "registration";
    } //집에서 수정

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {

        return "save";
    }
}