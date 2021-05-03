package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 1 整合mybatis plus
* 2.配置数据源
*   配置mb
*
*
* 逻辑删除
* 1 配置全局逻辑删除规则（可省略）
* 2。配置逻辑删除组建bean（可省略）
* 3。给Bean加上逻辑删除注解@TableLogic
* */

@EnableFeignClients(basePackages = "com.atguigu.gulimall.product.feign")
@MapperScan({"com/atguigu/gulimall/product/dao"})
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
