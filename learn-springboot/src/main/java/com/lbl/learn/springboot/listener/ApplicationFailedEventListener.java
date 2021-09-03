package com.lbl.learn.springboot.listener;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: BaoLei Li
 * @date: 2021/8/26
 **/
@Slf4j
public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent ApplicationFailedEvent) {
        log.info("ApplicationFailedEvent is triggered");
    }
}
