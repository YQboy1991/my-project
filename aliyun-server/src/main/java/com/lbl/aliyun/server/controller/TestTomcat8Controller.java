package com.lbl.aliyun.server.controller;

import org.springframework.web.bind.annotation.*;

import com.lbl.aliyun.server.model.User;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/**
 * @author: BaoLei Li
 * @date: 2021/9/14
 **/
@RestController
@RequestMapping("/api/tomcat")
@Slf4j
public class TestTomcat8Controller {

    @GetMapping(value = "/test/{userId}")
    public User sayHello(@PathVariable("userId") int userId) {
        return User.builder().id(userId).name("张三").age(20).build();
    }

    @GetMapping(value = "/cookie/set")
    public String setCookie(@RequestParam("value") String value, @RequestParam("key") String key,
            @RequestParam("domain") String domain, @RequestParam(required = false, value = "path", defaultValue = "/") String path,
            @RequestParam(required = false, value = "httpOnly", defaultValue = "true") Boolean httpOnly
            , HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie(key, value);
        cookie.setHttpOnly(httpOnly);
        cookie.setPath(path);
        cookie.setDomain(domain);
        response.addCookie(cookie);
        return "success";
    }

    @GetMapping(value = "/cookie/get")
    public String setCookie(@RequestParam("key") String key, HttpServletRequest request) throws IOException {
        Cookie[] cookies = request.getCookies();
        StringBuilder sb = new StringBuilder();
        for (Cookie cookie : cookies) {
            sb.append(cookie.getName()).append(":").append(cookie.getValue()).append(";");
        }
        return sb.toString();
    }
}
