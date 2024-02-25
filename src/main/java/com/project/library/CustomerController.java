package com.project.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.util.List;


@Controller
public class CustomerController {
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(String[] args) {
        return "registration";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String customer(Model m) {
        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
        DataSource ds = ac.getBean(DataSource.class);
        ExDAO ex = new ExDAO();
        List<ExDTO> list = ex.selectEx();
        for (ExDTO tmp:list) {
            System.out.println(tmp.getId() + "|" + tmp.getName());
        }
        System.out.println(list);
        m.addAttribute("list", list);
        return "customerList";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        return "save";
    }
}
