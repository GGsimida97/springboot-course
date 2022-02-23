package com.wangjf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${province}")
     private String province;
    @Value("${student.name}")
    private String name;
    @RequestMapping("/one")
    public String doSome(){
        System.out.println(province);
        System.out.println(name);
        return "Hello！SpringBoot";
    }
}
