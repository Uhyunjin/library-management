package com.project.library;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ExDAO {

    @Autowired
    DataSource ds;
        
    private SqlSession session;
    private static String namespace = "com.fastcampus.project.library.ExMapper.";
    //mapper위치 체크하고 수정하기
        
    @Override
    public List<BoardDto> selectAll() throws Exception {
        return session.selectList(namespace+"selectAll");
    }
}
