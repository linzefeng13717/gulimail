package com.atguigu.gulimail.product;

import com.aliyun.oss.*;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import com.google.common.annotations.VisibleForTesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;

import static com.aliyun.oss.common.auth.CredentialsProviderFactory.*;

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

    @Autowired
    OSSClient ossClient;


    public void testUpload() throws FileNotFoundException {
//        String endpoint = "oss-cn-beijing.aliyuncs.com";
//        String accessKeyId = "LTAI5t8WuNmMMwu82zNyfz8o";
//        String accessKeySecret = "KCrfTsuCtrmimImGZrAp5zhWjvQZdc";
//
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
        InputStream inputStream = new FileInputStream("C:\\Users\\86158\\Pictures\\Saved Pictures\\批注 2021-07-19 214816.png");

        ossClient.putObject("gulimail-forlin", "bug.jpg", inputStream);
        ossClient.shutdown();
        System.out.println("上传完成");
    }

    @Test
    public void contextLoads() throws FileNotFoundException {

        testUpload();
    }
}
