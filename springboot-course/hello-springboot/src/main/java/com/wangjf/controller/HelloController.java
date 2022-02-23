package com.wangjf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String doSome(){
        System.out.println("ddd");
        return "hello springboot!";
    }
}
