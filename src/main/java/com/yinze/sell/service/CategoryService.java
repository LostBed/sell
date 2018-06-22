package com.yinze.sell.service;

import com.yinze.sell.pojo.ProductCategory;

import java.util.List;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 16:46
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    
    List<ProductCategory> findAll();
    
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    
    ProductCategory save(ProductCategory productCategory);
}
