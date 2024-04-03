package com.project.library.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RentDao {

    @Autowired
    SqlSession session;
    private static String namespace = "com.project.library.rentMapper.";

}
