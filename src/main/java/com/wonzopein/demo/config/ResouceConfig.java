package com.wonzopein.demo.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * Created by seunghyeonoh on 15. 8. 4..
 */
@Configuration
@EnableWebMvc
public class ResouceConfig extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {

//    @Overri    de
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//        registry.addResourceHandler("/js/**")
//                .addResourceLocations("/js/");
//
//    }

}
