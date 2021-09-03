package com.lbl.learn.springboot.controller;

import com.demo.starter.config.service.ConfigService;
import com.lbl.learn.springboot.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: BaoLei Li
 * @date: 2021/8/19
 **/
@RestController
@RequestMapping("/api/hello")
@Slf4j
public class HelloController {

    // 通过注入ApplicationAvailability获取应用健康状态
    @Autowired
    private ApplicationAvailability applicationAvailability;

    @Autowired
    private ConfigService configService;

    @GetMapping("/availaby")
    public String getAvailaby(){
        LivenessState livenessState = applicationAvailability.getLivenessState();
        return livenessState.name();
    }

    @GetMapping("/readiness")
    public String getReadiness(){
        ReadinessState readinessState = applicationAvailability.getReadinessState();
        return readinessState.name();
    }

    @GetMapping("/config")
    public String getDemoConfig(){
        String configInfoString = configService.getConfigInfoString();
        log.info(configInfoString);
        return configInfoString;
    }

    @GetMapping("/user")
    @ResponseBody
    public User getUser(){
        return User.builder().id(123).name("zhangsan").build();
    }
}
