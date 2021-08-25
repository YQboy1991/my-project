package com.lbl.aliyun.server.controller;

import com.lbl.aliyun.server.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * hello world项目
 * @author: BaoLei Li
 * @date: 2021/8/18
 **/
@Controller
@RequestMapping("/api/hello")
@Slf4j
public class HelloController {

    @GetMapping("/say")
    @ResponseBody
    public String sayHello(@RequestParam("param") String param){
        log.info("param is [{}]", param);
        return param;
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public User sayHello(){
        return User.builder().id(12).name("张三").age(20).build();
    }

}