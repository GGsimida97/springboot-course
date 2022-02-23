package com.wangjf.controller.impl;

import com.wangjf.controller.Dao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements Dao {
    @Override
    public void doSome() {
        System.out.println("doSome~~~");
    }
}
