package com.lbl.aliyun.server.controller;

import org.springframework.web.bind.annotation.*;

import com.lbl.aliyun.server.model.User;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: BaoLei Li
 * @date: 2021/9/14
 **/
@RestController
@RequestMapping("/api/tomcat")
@Slf4j
public class TestTomcat8Controller {

    @GetMapping(value = "/test/{userId}")
    @ResponseBody
    public User sayHello(@PathVariable("userId") int userId){
        return User.builder().id(userId).name("张三").age(20).build();
    }
}
