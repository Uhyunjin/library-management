package com.project.library.dao;

import com.project.library.domain.RentDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RentDao {

    @Autowired
    SqlSession session;
    private static String namespace = "com.project.library.rentMapper.";

    public List<RentDto> selectAll(){
        return session.selectList(namespace + "selectAll");
    }

}