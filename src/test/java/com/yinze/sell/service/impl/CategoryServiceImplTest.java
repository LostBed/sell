package com.yinze.sell.service.impl;

import com.yinze.sell.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 16:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(2);
        Assert.assertEquals(new Integer(2),productCategory.getCategoryId());
        System.out.println(productCategory.toString());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList  =categoryService.findByCategoryTypeIn(Arrays.asList(2,3,4));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("男生专享",10);
        ProductCategory result=categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}