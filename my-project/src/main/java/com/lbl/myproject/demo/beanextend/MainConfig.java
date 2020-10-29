package com.lbl.myproject.demo.beanextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author: BaoLei Li
 * @date: 2020/10/21
 **/
@Configuration
@ComponentScan("com.lbl.myproject.demo.beanextend")
public class MainConfig implements BeanPostProcessor, InitializingBean {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("mainConfig")){
            System.out.println("Before init方法的后置处理器");
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("mainConfig")){
            System.out.println("After init方法的后置处理器");
        }
        return bean;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init方法");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct");
    }
}
