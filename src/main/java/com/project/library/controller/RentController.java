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
import java.util.Map;

@Controller
public class RentController {
    @Autowired
    RentDao rentDao;

    @RequestMapping(value = "/payment", method = RequestMethod.GET)
    public String totalCost(Model m) throws Exception{
        List<Map<String, Object>> list = rentDao.totalCost();
        m.addAttribute("list", list);
        System.out.println(list);
        return "payment";
    }

    @RequestMapping(value = "/rent", method = RequestMethod.GET)
    public String rentList(Model m) {
        try {
        List<RentDto> list = rentDao.selectAll();
            m.addAttribute("list", list);
            System.out.println(list);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "rentList";
    }
}
