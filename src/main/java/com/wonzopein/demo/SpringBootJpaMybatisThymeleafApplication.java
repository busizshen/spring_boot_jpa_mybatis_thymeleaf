package com.wonzopein.demo;

import com.wonzopein.demo.mybatis.propertis.MyBatisProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyBatisProperties.class)
public class SpringBootJpaMybatisThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaMybatisThymeleafApplication.class, args);
    }
}
