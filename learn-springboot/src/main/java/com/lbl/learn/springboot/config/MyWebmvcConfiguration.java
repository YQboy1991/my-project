package com.lbl.learn.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * JsonP实现
 * @author: BaoLei Li
 * @date: 2021/9/3
 **/
@Configuration
public class MyWebmvcConfiguration implements WebMvcConfigurer {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(jsonPHttpMessageConverter());
    }

    @Bean
    public JsonPHttpMessageConverter jsonPHttpMessageConverter(){
        return new JsonPHttpMessageConverter();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/static/**").addResourceLocations("classpath:/custom/");
    }
}
