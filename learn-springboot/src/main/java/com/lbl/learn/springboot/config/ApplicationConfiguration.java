package com.lbl.learn.springboot.config;

import com.lbl.learn.springboot.config.propertysupport.DatePropertyEditorRegistrar;
import com.lbl.learn.springboot.config.propertysupport.StringPropertyEditorRegistrar;
import io.rsocket.RSocket;
import io.rsocket.frame.decoder.PayloadDecoder;
import io.rsocket.transport.netty.client.TcpClientTransport;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;

/**
 * @author: BaoLei Li
 * @date: 2021/9/16
 **/
@Configuration
public class ApplicationConfiguration {

//    @Bean
    public ConfigurableWebBindingInitializer configurableWebBindingInitializer(){
        ConfigurableWebBindingInitializer configurableWebBindingInitializer = new ConfigurableWebBindingInitializer();
        configurableWebBindingInitializer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[] {
                new StringPropertyEditorRegistrar(), new DatePropertyEditorRegistrar() });
        return configurableWebBindingInitializer;
    }

//    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(){
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(8083);
        return factory;
    }

    @Bean
    public RSocketRequester rSocketRequester() {
        return RSocketRequester
                .builder()
                .tcp("localhost", 7000);
    }
}
