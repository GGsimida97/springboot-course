package com.wangjf.util;

import lombok.Data;

/**
 * 此包装类为了实现前后端的数据统一
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

}
