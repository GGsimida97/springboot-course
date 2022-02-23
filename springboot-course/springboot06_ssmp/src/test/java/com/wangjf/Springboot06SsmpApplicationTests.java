package com.wangjf;

import com.github.pagehelper.PageInfo;
import com.wangjf.dao.ProductDao;

import com.wangjf.dao.StudentDao;
import com.wangjf.domain.ProductInfo;
import com.wangjf.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class Springboot06SsmpApplicationTests {
    @Autowired
    ProductDao productdao;
    @Autowired
    ProductService productService;
  /*  @Autowired
    StudentDao studentDao;*/

    @Test
    public void contextLoads() {
        System.out.println(productdao.selectBypId(1));
    }

    /*
        @Test
        public void TestStudent() {
            System.out.println(studentDao);
            System.out.println(studentDao.selectById(2));
        }*/
    @Test
    void testSplitPageForPageInfo() {
        ProductInfo productInfo = new ProductInfo();
        //productInfo.setTypeId("电脑");
        PageInfo pageInfo = productService.splitPageForPageInfo(1, 3,null);
        List<ProductInfo> productInfoList = pageInfo.getList();
        for (ProductInfo p : productInfoList) {
            System.out.println(p);
        }
    }

/*    @Test
    void testSplitPageForCurrentPage() {
        List<ProductInfo> productInfos = productService.splitPageForCurrentPage(1, 5, null);
        for (ProductInfo productInfo : productInfos) {
            System.out.println(productInfo);
        }

    }*/

    @Test
    void testQueryById() {

        System.out.println(productService.queryById(6));
    }

    @Test
    void testSaveInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setPName("iphone14");
        productInfo.setPContent("128GB");
        productInfo.setPPrice(5999.35);
        productInfo.setPNumber(1);
        productInfo.setTypeId("1");
        System.out.println(productService.saveInfo(productInfo));
    }

    @Test
    void testUpdateInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setPName("iphone14");
        productInfo.setPContent("128GB");
        productInfo.setPPrice(5999.00);
        productInfo.setPNumber(1);
        productInfo.setTypeId("1");
        productInfo.setPId(44);
        System.out.println(productService.updateInfo(productInfo));
    }


    @Test
    void testDeleteProductById() {
        System.out.println(productService.deleteProductById(45));
    }

  /*  @Test
    void testQueryAllProductInfo() {
        List<ProductInfo> productInfoList = productService.queryAllProductInfo();
        for (ProductInfo productInfo : productInfoList) {
            System.out.println(productInfo);
        }
    }*/
}
