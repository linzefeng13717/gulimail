package com.atguigu.gulimail.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@Component
@SpringBootTest
class GulimailThirdPartyApplicationTests {

	@Autowired
	OSSClient ossClient;

	public void uploadTest() throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("C:\\Users\\86158\\Desktop\\Folder Root\\Figure_1.png");

		ossClient.putObject("gulimail-forlin", "abaaba.png", inputStream);

		ossClient.shutdown();

		System.out.println("uploaded...");

	}

	@Test
	public void test() throws FileNotFoundException {
		uploadTest();
	}

}
