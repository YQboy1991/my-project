package com.lbl.learn.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

/**
 * @author: BaoLei Li
 * @date: 2021/9/10
 **/
@RestController
@RequestMapping("/api/error")
public class CustomErrorController {

    @GetMapping("/test")
    public String testErrorHandler(){
        throw new RuntimeException();
    }

    @ExceptionHandler(value = Exception.class)
    public Map<String, Object> handlerErrorControllerError() {
        return ImmutableMap.<String, Object> of("status", 500, "message", "inner error");
    }

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("111", 11);
        jsonObject.put("111",22);

        System.out.println(jsonObject.toJSONString());
    }
}
