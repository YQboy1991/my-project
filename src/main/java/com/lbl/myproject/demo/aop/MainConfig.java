package com.lbl.myproject.demo.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: BaoLei Li
 * @date: 2020/9/30
 **/
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
public class MainConfig {

    @Bean
    public LblCalculate calculate() {return new LblCalculate();}

    @Bean
    public LblLogAspect lblLogAspect() {return new LblLogAspect();}
}
