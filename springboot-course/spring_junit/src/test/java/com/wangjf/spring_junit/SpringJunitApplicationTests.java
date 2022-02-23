package com.wangjf.spring_junit;

import com.wangjf.SpringJunitApplication;
import com.wangjf.dao.OneDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringJunitApplication.class)
class SpringJunitApplicationTests {
    @Autowired
    private OneDao oneDao;

    @Test
    void contextLoads() {
        oneDao.save();
        System.out.println("ddd");
    }

}
