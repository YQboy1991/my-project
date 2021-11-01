package com.lbl.learn.springboot.controller;

import com.lbl.learn.springboot.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: BaoLei Li
 * @date: 2021/10/12
 **/
@Controller
@Slf4j
public class RSocketController {

    @MessageMapping("/api/rsocket/hello")
    @ResponseBody
    public String getUser(@RequestParam(required = false, defaultValue = "123", value = "key") String key) {
        log.info("===rsocket key is [{}]", key);
        return key;
    }
}
