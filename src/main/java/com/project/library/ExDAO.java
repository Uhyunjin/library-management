package com.project.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExDAO {
    ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
    DataSource ds = ac.getBean(DataSource.class);
//    public static void main(String[] args) {
//        ExDAO ex = new ExDAO();
//        List<ExDTO> list = ex.selectEx();
//        for (ExDTO tmp:list) {
//            System.out.println(tmp.getId() + "|" + tmp.getName());
//        }
//        System.out.println(list);
//    }

    public List<ExDTO> selectEx() {
        ExDTO ex = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from ex";

        List<ExDTO> list = new ArrayList();

        try {
            conn = ds.getConnection();
            System.out.println("DB접속 성공");
            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1,id);
            Statement st = conn.createStatement();
            rs = pstmt.executeQuery();
//            rs = st.executeQuery(sql);

            while (rs.next()) {
                ex = new ExDTO();
                ex.setId(rs.getInt("id"));
                ex.setName(rs.getString("name"));
//                System.out.println("st = " + st);
                list.add(ex);
                System.out.println("ex = "+ex);
            }

        } catch (SQLException e){
            System.out.println("e : "+e);
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println("e = " + e);
            }
        }
        return list;
    }
}
