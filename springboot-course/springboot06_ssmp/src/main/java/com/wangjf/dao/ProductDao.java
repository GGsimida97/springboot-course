package com.wangjf.dao;


import com.wangjf.domain.ProductInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductDao {
    @Select("select * from product_info where p_id=#{pId}")
    ProductInfo selectBypId(Integer pId);

    //查询全部，为了利用pageHelper插件实现分页（模糊查询）
    // @Select("select * from product_info")
   /*@Select("<script>"
            +"select * from product_info"
            + "<where>"
            + "<if test='typeId !=null'> and type_id like CONCAT('%',#{typeId},'%')</if>"
            + "<if test='pName !=null'> and p_name like CONCAT('%',#{pName},'%')</if>"
            + "<if test='pContent !=null'> and p_content like CONCAT('%',#{pContent},'%')</if>"
            + "<if test='pNumber !=null'> and p_number like CONCAT('%',#{pNumber},'%')</if>"
            + "<if test='pPrice !=null'> and p_price like CONCAT('%',#{pPrice},'%')</if>"
            + "</where>"
            +"</script>"
    )*/

 @Select("<script>"
            +"select * from product_info"
            + "<where>"
            + "<if test='typeId !=null and typeId != \"\"'> and type_id like CONCAT('%',#{typeId},'%')</if>"
            + "<if test='pName !=null and pName != \"\"'> and p_name like CONCAT('%',#{pName},'%')</if>"
            + "<if test='pContent !=null and pContent != \"\"'> and p_content like CONCAT('%',#{pContent},'%')</if>"
            + "<if test='pNumber !=null and pNumber != \"\"'> and p_number like CONCAT('%',#{pNumber},'%')</if>"
            + "<if test='pPrice !=null and pPrice != \"\"'> and p_price like CONCAT('%',#{pPrice},'%')</if>"
            + "</where>"
            +"</script>"
    )

    List<ProductInfo> selectAll(ProductInfo productInfo);

    //更新产品信息
    @Update("update product_info set p_name=#{pName},p_content=#{pContent},p_price=#{pPrice}" +
            ",p_number=#{pNumber},type_id=#{typeId} where p_id=#{pId}")
    boolean updateProductInfo(ProductInfo productInfo);

    //添加商品信息
    @Insert("insert into product_info (p_name,p_content,p_price,p_number,type_id) " +
            "values (#{pName},#{pContent},#{pPrice},#{pNumber},#{typeId})")
    boolean insertProductInfo(ProductInfo productInfo);

    //删除商品信息
    @Delete("delete from product_info where p_id=#{pId}")
    boolean deleteById(Integer pId);
}
