package com.lbl.learn.springboot.service;

import com.lbl.learn.springboot.domain.User;
import reactor.core.publisher.Mono;

/**
 * @author: BaoLei Li
 * @date: 2021/9/24
 **/
public interface IUserService {

    Mono<User> getUser();

    User getUser1();
}
