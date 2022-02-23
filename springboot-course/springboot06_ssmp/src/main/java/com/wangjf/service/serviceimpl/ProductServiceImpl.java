package com.wangjf.service.serviceimpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangjf.dao.ProductDao;
import com.wangjf.domain.ProductInfo;
import com.wangjf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    /**
     * 通过pId查询单个数据
     */
    @Override
    public ProductInfo queryById(Integer pId) {
        return productDao.selectBypId(pId);
    }


    /**
     * 新增商品信息
     */
    @Override
    public boolean saveInfo(ProductInfo productInfo) {

        return productDao.insertProductInfo(productInfo);
    }

    /**
     * 修改商品信息
     */
    @Override
    public boolean updateInfo(ProductInfo productInfo) {
        return productDao.updateProductInfo(productInfo);
    }


    /**
     * 查询全部商品信息
     */
    @Override
    public List<ProductInfo> queryAllProductInfo() {
        return productDao.selectAll(null);
    }

    /**
     * 分页查询（基于此实现多条件模糊查询）
     */
    @Override
    public PageInfo<ProductInfo> splitPageForPageInfo(int pageNum, int pageSize, ProductInfo productInfo) {
        PageHelper.startPage(pageNum, pageSize);
        List<ProductInfo> productInfoList = productDao.selectAll(productInfo);//由于PageHelper已经注册为插件，会自动在原sql语句后面添加limit
        PageInfo<ProductInfo> pageInfo = new PageInfo<>(productInfoList);
        return pageInfo;
    }

    /**
     * 通过pId删除单个商品
     */
    @Override
    public boolean deleteProductById(Integer pId) {
        return productDao.deleteById(pId);
    }

}
