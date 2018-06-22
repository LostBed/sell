package com.yinze.sell.service.impl;

import com.yinze.sell.dao.ProductCategoryDao;
import com.yinze.sell.pojo.ProductCategory;
import com.yinze.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 16:48
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    private ProductCategoryDao productCategoryDao;
    
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategoryDao.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryDao.save(productCategory);
    }
}
