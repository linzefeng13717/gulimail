package com.atguigu.gulimail.product;



/**
 * @author: 林式懒惰
 * @version: 1.0
 */


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.atguigu.gulimail.product.feign")
@MapperScan("com.atguigu.gulimail.product.dao") //告诉mapper接口所在的位置
@SpringBootApplication
@EnableDiscoveryClient
public class GulimailProductApplication{

    public static void main(String[] args){
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}