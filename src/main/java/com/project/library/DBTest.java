package com.project.library;

import com.mysql.cj.protocol.Resultset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Controller
public class DBTest {

//    @Autowired
//    DataSource ds;
    public String dbTest(String[] args) throws Exception {
//        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
//        DataSource ds = ac.getBean(DataSource.class);

//        Connection conn = (Connection)ds.getConnection();
//        System.out.println("conn = " + conn);
//        System.out.println("DB접속 성공");

//        Statement stmt = conn.createStatement();
//
//        String query = "select * from tbl_customer";
//        ResultSet rs = stmt.executeQuery(query);
//
//        while (rs.next()) {
//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));
//            System.out.println(rs.getString(4));
//            System.out.println(rs.getString(5));
//            System.out.println(rs.getString(6));
//        }
        return "home";
    }


}
