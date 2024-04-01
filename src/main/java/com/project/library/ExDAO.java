package com.project.library;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
@Repository
public class ExDAO {

    @Autowired
    DataSource ds;

    public ExDTO selectAll() {
        ExDTO ex = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from user";

        try {
            conn = ds.getConnection();
            pstmt = conn.prepareStatement(sql); // SQL Injection공격, 성능향상

            rs = pstmt.executeQuery(); //  select

            if (rs.next()) {
                ex = new ExDTO();
                ex.setId(rs.getInt(1));
            }
        } catch (SQLException e) {
            return null;

//            close(rs, pstmt, conn);  //     private void close(AutoCloseable... acs) {
        }

        return ex;
    }
}
