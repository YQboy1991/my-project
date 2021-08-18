package com.lbl.aliyun.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world项目
 * @author: BaoLei Li
 * @date: 2021/8/18
 **/
@RestController
@RequestMapping("/api/hello")
@Slf4j
public class HelloController {

    @GetMapping("/say")
    public String sayHello(@RequestParam("param") String param){
        log.info("param is [{}]", param);
        return param;
    }

}