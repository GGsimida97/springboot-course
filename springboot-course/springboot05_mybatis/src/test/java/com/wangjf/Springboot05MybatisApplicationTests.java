package com.wangjf;

import com.wangjf.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {
    @Autowired
    private StudentDao dao;

    @Test
    void testFindById() {
        System.out.println(dao.findById(3));
    }

}
