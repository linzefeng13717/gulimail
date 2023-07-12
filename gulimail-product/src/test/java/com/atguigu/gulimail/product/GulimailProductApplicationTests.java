package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import com.google.common.annotations.VisibleForTesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: 林式懒惰
 * @version: 1.0
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("华为为");
        brandService.save(brandEntity);
        System.out.println("保存成功！");

        List<BrandEntity> list = brandService.list();
        list.forEach(System.out::println);
    }
}
