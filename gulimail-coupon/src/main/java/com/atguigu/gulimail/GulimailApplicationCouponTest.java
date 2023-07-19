package com.atguigu.gulimail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: 林式懒惰
 * @version: 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimailApplicationCouponTest {

    public static void main(String[] args) {
        SpringApplication.run(GulimailApplicationCouponTest.class, args);
    }
}
