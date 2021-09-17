package com.lbl.learn.springboot.config;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;

/**
 * @author: BaoLei Li
 * @date: 2021/9/9
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handleException(Exception exception) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("errorCode", 500);
        map.put("errorMsg", exception.toString());
        return map;
    }

}
