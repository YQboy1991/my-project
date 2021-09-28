package com.lbl.learn.springboot.webflux;

import com.lbl.learn.springboot.domain.User;
import com.lbl.learn.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Date;

/**
 * @author: BaoLei Li
 * @date: 2021/9/18
 **/
@RestController
@RequestMapping("/api/webflux")
public class MyReactorController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public Mono<User> getUser() {
//        User zhangsan = User.builder().id(123).name("zhangsan").birthDay(new Date()).build();
//        return Mono.just(zhangsan).delayElement(Duration.ofMillis(500));
        return userService.getUser();
    }

    @GetMapping("/user1")
    public Mono<String> getUser1() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Mono.just("hahaha");
    }
}
