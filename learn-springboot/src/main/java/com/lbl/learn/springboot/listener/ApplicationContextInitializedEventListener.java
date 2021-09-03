package com.lbl.learn.springboot.listener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: BaoLei Li
 * @date: 2021/8/26
 **/
@Slf4j
public class ApplicationContextInitializedEventListener implements ApplicationListener<ApplicationContextInitializedEvent> {

    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent applicationContextInitializedEvent) {
        log.info("ApplicationContextInitializedEvent is triggered");
    }
}
