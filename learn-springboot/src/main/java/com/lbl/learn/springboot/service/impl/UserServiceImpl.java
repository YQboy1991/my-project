package com.lbl.learn.springboot.service.impl;

import com.lbl.learn.springboot.domain.User;
import com.lbl.learn.springboot.service.IUserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Date;

/**
 * @author: BaoLei Li
 * @date: 2021/9/24
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public Mono<User> getUser() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User zhangsan = User.builder().id(123).name("zhangsan").birthDay(new Date()).build();
        return Mono.just(zhangsan);
    }

    @Override
    public User getUser1() {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        User zhangsan = User.builder().id(123).name("zhangsan").birthDay(new Date()).build();
        return zhangsan;
    }
}
