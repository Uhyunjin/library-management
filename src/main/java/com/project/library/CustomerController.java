package com.project.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.objenesis.ObjenesisException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CustomerController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(String[] args) {
        return "registration";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String customer(Model m) {
        return "customerList";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        return "save";
    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(int cust_no, String cust_name, String phone, String join_date, String cust_email, String grade) {
        String sql = "insert into tbl_customer(cust_no, cust_name, phone, now(), cust_email, grade) values(?, ?, ?, ?, ?, ?)";
        Object[] params = {cust_no, cust_name, phone, join_date, cust_email, grade};
        jdbcTemplate.update(sql, params);
        System.out.println(params);
        return "registration";
    }
}
