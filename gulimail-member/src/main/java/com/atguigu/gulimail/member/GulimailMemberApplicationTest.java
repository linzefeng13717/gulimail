package com.atguigu.gulimail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: 林式懒惰
 * @version: 1.0
 */

@EnableFeignClients(basePackages = "com.atguigu.gulimail.member.feign") //开启远程调用功能，指定哪个包要扫描
@EnableDiscoveryClient
@SpringBootApplication
public class GulimailMemberApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplicationTest.class, args);
    }
}
