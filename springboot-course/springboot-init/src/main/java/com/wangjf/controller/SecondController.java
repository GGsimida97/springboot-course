package com.wangjf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @RequestMapping("/two")
    public String doSome(){
        return "Hello！SpringBoot";
    }
}
