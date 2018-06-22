package com.yinze.sell.service;

import com.yinze.sell.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:20
 */

public interface ProductService {
    
    ProductInfo findOne(String productId);
    
    List<ProductInfo> findUpAll();
    
    Page<ProductInfo> findAll(Pageable pageable);
    
    ProductInfo save(ProductInfo productInfo);
    
    
}
