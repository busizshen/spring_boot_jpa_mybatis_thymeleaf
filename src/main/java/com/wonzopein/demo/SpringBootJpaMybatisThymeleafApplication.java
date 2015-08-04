package com.wonzopein.demo;

import com.wonzopein.demo.mybatis.propertis.MyBatisProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * The type Spring boot jpa mybatis thymeleaf application.
 */
@SpringBootApplication
@EnableConfigurationProperties(MyBatisProperties.class)
public class SpringBootJpaMybatisThymeleafApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaMybatisThymeleafApplication.class, args);
    }
}
