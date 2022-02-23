package com.wangjf.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 只需处理表现层（Controller）的异常==========业务层、数据层的异常会抛到表现层的
 * */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //拦截所有异常信息
    @ExceptionHandler
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R(false,"操作存在异常！");
    }
}
