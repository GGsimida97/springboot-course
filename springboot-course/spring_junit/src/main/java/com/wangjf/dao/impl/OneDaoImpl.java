package com.wangjf.dao.impl;

import com.wangjf.dao.OneDao;
import org.springframework.stereotype.Repository;

@Repository(value = "oneDao")
public class OneDaoImpl implements OneDao {
    @Override
    public void save() {
        System.out.println("save!!!!");
    }
}
