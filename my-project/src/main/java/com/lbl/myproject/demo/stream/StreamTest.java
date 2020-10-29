package com.lbl.myproject.demo.stream;

import reactor.core.publisher.Mono;

/**
 * @author: BaoLei Li
 * @date: 2020/8/12
 **/
public class StreamTest {

    public static void main(String[] args) {
        Mono.just("libaolei").map(String::toUpperCase).map(n -> "My father " + n + "!").subscribe(System.out::println);
    }


}
