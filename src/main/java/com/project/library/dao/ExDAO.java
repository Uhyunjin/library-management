package com.project.library.dao;
import com.project.library.domain.ExDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ExDAO {

    @Autowired
//    DataSource ds;
    private SqlSession session;
    private static String namespace = "com.project.library.exMapper.";
    //mapper위치 체크하고 수정하기
        
    public List<ExDTO> selectAll() throws Exception {
        return session.selectList(namespace+"selectAll");
    }
}
