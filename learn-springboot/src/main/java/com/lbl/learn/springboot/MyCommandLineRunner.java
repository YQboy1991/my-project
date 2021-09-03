package com.lbl.learn.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: BaoLei Li
 * @date: 2021/8/26
 **/
@Component
@Slf4j
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("MyCommandLineRunner is triggered");
    }
}
