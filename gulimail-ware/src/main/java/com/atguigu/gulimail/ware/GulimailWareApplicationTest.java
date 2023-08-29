package com.atguigu.gulimail.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: 林式懒惰
 * @version: 1.0
 */

@EnableTransactionManagement
@MapperScan("com.atguigu.gulimail.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimailWareApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(GulimailWareApplicationTest.class, args);
    }
}
