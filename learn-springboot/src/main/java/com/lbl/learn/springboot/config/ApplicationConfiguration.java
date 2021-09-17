package com.lbl.learn.springboot.config;

import com.lbl.learn.springboot.config.propertysupport.DatePropertyEditorRegistrar;
import com.lbl.learn.springboot.config.propertysupport.StringPropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;

/**
 * @author: BaoLei Li
 * @date: 2021/9/16
 **/
@Configuration
public class ApplicationConfiguration {

    @Bean
    public ConfigurableWebBindingInitializer configurableWebBindingInitializer(){
        ConfigurableWebBindingInitializer configurableWebBindingInitializer = new ConfigurableWebBindingInitializer();
        configurableWebBindingInitializer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[] {
                new StringPropertyEditorRegistrar(), new DatePropertyEditorRegistrar() });
        return configurableWebBindingInitializer;
    }
}
