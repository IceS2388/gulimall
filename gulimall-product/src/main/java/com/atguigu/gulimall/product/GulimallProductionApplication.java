package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao") //mapper接口
public class GulimallProductionApplication {
    public static void main(String[] args) {
        SpringApplication.run(
                GulimallProductionApplication.class, args
        );
    }
}
