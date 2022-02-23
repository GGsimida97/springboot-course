package com.wangjf.domain;

import lombok.Data;


@Data
public class ProductInfo {
    private Integer pId;
    private String pName;
    private String pContent;
    private Double pPrice;
    private Integer pNumber;
    private String typeId;

}
