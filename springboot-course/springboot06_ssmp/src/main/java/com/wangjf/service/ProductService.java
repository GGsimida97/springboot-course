package com.wangjf.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.wangjf.domain.ProductInfo;

import java.util.List;

public interface ProductService {
    //通过pId查询商品信息
    ProductInfo queryById(Integer pId);

    //新增商品信息
    boolean saveInfo(ProductInfo productInfo);

    //修改商品信息
    boolean updateInfo(ProductInfo productInfo);

   //查询全部商品
    List<ProductInfo> queryAllProductInfo();

   /* //分页查询返回分页对象PageInfo
    PageInfo<ProductInfo> splitPageForPageInfo(int pageNum, int pageSize);*/

    //模糊查询
    PageInfo<ProductInfo> splitPageForPageInfo(int pageNum, int pageSize, ProductInfo productInfo);

    //删除商品
    boolean deleteProductById(Integer pId);
}