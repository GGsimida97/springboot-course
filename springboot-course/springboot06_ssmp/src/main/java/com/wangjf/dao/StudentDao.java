package com.wangjf.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangjf.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
/*    @Select("select * from student where id=#{id}")
    Student findById(Integer id);*/
}
