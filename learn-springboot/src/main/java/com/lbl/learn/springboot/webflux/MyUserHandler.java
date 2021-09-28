package com.lbl.learn.springboot.webflux;

import com.lbl.learn.springboot.domain.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author: BaoLei Li
 * @date: 2021/9/23
 **/
@Component
public class MyUserHandler {

    public Mono<ServerResponse> getUser(ServerRequest request) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(User.builder().id(123).name("zhangsan").birthDay(new Date()).build()), User.class);
    }
}
