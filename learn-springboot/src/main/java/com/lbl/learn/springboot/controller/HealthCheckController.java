package com.lbl.learn.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: BaoLei Li
 * @date: 2021/10/14
 **/
@RestController
@RequestMapping("/")
@Slf4j
public class HealthCheckController {

    @GetMapping("/health")
    @ResponseBody
    public String check() {
        return "success";
    }
}
