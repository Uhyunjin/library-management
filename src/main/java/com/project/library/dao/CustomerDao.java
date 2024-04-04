package com.project.library.dao;

import com.project.library.domain.CustomerDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDao {

    @Autowired
    SqlSession session;

    private static String namespace = "com.project.library.customerMapper.";

    public List<CustomerDto> selectAll() throws Exception{
        return session.selectList(namespace + "selectAll");
    }

    public CustomerDto selectId(int id) throws Exception{
        return session.selectOne(namespace + "selectId", id);
    }

//    public int insertUser(CustomerDto customerDto) throws Exception{
//        return session.selectList(namespace + "insertCustomer", customerDto);
//    }


}
