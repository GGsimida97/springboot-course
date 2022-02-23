package com.wangjf.dao;

import com.wangjf.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao {
    @Select("select id,name,age from student where id=#{id}")
    Student findById(int id);
}
