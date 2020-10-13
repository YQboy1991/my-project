package com.lbl.myproject.demo.testAnnoConfigAC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: BaoLei Li
 * @date: 2020/7/5
 **/
@Configuration
@ComponentScan(value = "com.lbl.myproject.demo.testAnnoConfigAC")
public class MainConfig {

//    @Bean(value = {"dog1","dog2"})
//    public Dog dog(){
//        return new Dog();
//    }

}
