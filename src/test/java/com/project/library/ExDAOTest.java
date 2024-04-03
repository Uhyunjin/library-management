package com.project.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class ExDAOTest {
    @Autowired
    ExDAO exDAO;
    @Test
    public void selectAllTest() throws Exception {
        List<ExDTO> list = exDAO.selectAll();
        assertTrue(list.size() != 0);

    }
}