package com.lbl.learn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: BaoLei Li
 * @date: 2021/8/19
 **/
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    // 通过注入ApplicationAvailability获取应用健康状态
    @Autowired
    private ApplicationAvailability applicationAvailability;

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
}
