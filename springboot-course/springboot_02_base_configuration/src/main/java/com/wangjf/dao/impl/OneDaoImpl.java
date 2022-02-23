package com.wangjf.dao.impl;

import com.wangjf.dao.OneDao;
import org.springframework.stereotype.Repository;

@Repository
public class OneDaoImpl implements OneDao {
    @Override
    public void save() {
        System.out.println("save()方法执行了~~~");
    }
}
