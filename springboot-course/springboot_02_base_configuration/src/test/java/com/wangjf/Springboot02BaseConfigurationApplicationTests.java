package com.wangjf;

import com.wangjf.dao.OneDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02BaseConfigurationApplicationTests {
    @Autowired
    private OneDao dao;

    @Test
    public void contextLoads() {
        dao.save();
    }

}
