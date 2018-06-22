package com.yinze.sell.dao;

import com.yinze.sell.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:02
 */

public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {
    
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
