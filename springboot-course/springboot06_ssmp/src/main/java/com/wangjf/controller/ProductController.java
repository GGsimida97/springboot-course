package com.wangjf.controller;

import com.wangjf.domain.ProductInfo;
import com.wangjf.service.ProductService;
import com.wangjf.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.List;

/**
 * @Controller 包括了 @RestController。@RestController 是 Spring4 后新加的注解，
 * 从 RestController 类源码可以看出 @RestController 是 @Controller 和 @ResponseBody 两个注解的结合体。
 * @ResponseBody 返回 json 格式
 * @GetMapping、@PostMapping、@PutMapping、@DeleteMapping 是 @RequestMapping 的子集。
 * 所以实际上我们只需要掌握 @Controller 和 @RequestMapping 就可以了。
 */

/**
 * @Controller 一般应用在有返回界面的应用场景下.
 * 例如，管理后台使用了 thymeleaf 作为模板开发，需要从后台直接返回 Model 对象到前台，那么这时候就需要使用 @Controller 来注解。
 * @RestController 如果只是接口，那么就用 RestController 来注解.
 * <p>
 * 例如前端页面全部使用了 Html、Jquery来开发，通过 Ajax 请求服务端接口，那么接口就使用 @RestController 统一注解。
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public R save(@RequestBody ProductInfo productInfo) {
        /**
         * 新增用post请求
         * 请求体中获取json格式的数据 故而用@ResquestBody
         * */
        if (productInfo != null) {
            return new R(productService.saveInfo(productInfo));
        } else return new R(false);
    }


    @PutMapping()
    public R update(@RequestBody ProductInfo productInfo) {
        /**
         * 更新数据用put请求
         * 请求体中获取json格式的数据 故而用@ResquestBody
         * */
        return new R(productService.updateInfo(productInfo));
    }

    //http://localhost/products/6
    @DeleteMapping("{pid}")
    public R delete(@PathVariable Integer pid) {
        /**
         * 通过路径中的pid删除单个商品
         * 删除数据用delete请求
         * */
        return new R(productService.deleteProductById(pid));
    }

    @GetMapping
    public R getAll() {
        /**
         * 获取全部商品信息
         * */
        return new R(true, productService.queryAllProductInfo());
    }

    @GetMapping("{pageNum}/{pageSize}")
    public R getPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize, ProductInfo productInfo) {
        /**
         * 分页查询(模糊查询)
         * */
        //当最后一页只有一条数据时，删除其，而后通过当前pageNum查询的数据为null
        //使用mybatisPlus时 需要手动判断 当前页码值>最大页码值 时，查询最大页码值
        //而使用pageHelper 底层已为我们进行了处理（查询最大页码值对应的数据）

        //System.out.println(pageNum);
        System.out.println(productInfo);

        return new R(true, productService.splitPageForPageInfo(pageNum, pageSize, productInfo));
    }


    @GetMapping("{pid}")
    public R getByPid(@PathVariable Integer pid) {
        /**
         * 通过路径中的pid查询单个商品信息
         * */
        return new R(true, productService.queryById(pid));
    }

}
