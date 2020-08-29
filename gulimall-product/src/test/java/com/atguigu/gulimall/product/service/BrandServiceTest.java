package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.BrandEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BrandServiceTest {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){

        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setDescript("众所周知");
        brandEntity.setName("华为");


        brandService.save(brandEntity);

        System.out.println("保存成功....");
    }

}