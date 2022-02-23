package com.wangjf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {
    @Autowired
   private Environment environment;
    @RequestMapping("/two")
    public String doSome(){
        System.out.println(environment.getProperty("province"));
        System.out.println(environment.getProperty("student.name"));
        System.out.println(environment.getProperty("server.port"));
        return "Hello！SpringBoot";
    }
}
