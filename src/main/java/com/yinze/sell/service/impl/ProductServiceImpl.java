package com.yinze.sell.service.impl;

import com.yinze.sell.dao.ProductInfoDao;
import com.yinze.sell.enmus.ProductStatusEnum;
import com.yinze.sell.pojo.ProductInfo;
import com.yinze.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:23
 */
@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductInfoDao productInfoDao;
    
    @Override
    public ProductInfo findOne(String productId) {
        return productInfoDao.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoDao.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoDao.save(productInfo);
    }
}
