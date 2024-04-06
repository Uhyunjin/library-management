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
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    ExDAO exDAO;
    @Autowired
    CustomerDao customerDao;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    // 고객 등록 화면 Form
    public String registration(Model m) {
        m.addAttribute("mode", "new");
        return "registration";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    // 홈화면
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    // 고객 리스트
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
    // 고객 리스트에서 선택한 고객 정보를 폼 화면에서 확인
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
    // 선택한 고객 정보 수정 post
    public String customerEditPost(CustomerDto customerDto, Model m, HttpSession session) {
        try {
        } catch (Exception e) {
        }
        return "customerList";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String newUser(Model m) {

        return "save";
    }
}