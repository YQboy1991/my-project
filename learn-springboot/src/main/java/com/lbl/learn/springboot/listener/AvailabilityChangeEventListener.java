package com.lbl.learn.springboot.listener;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: BaoLei Li
 * @date: 2021/8/26
 **/
@Slf4j
public class AvailabilityChangeEventListener implements ApplicationListener<AvailabilityChangeEvent> {

    @Override
    public void onApplicationEvent(AvailabilityChangeEvent availabilityChangeEvent) {
        log.info("AvailabilityChangeEvent is triggered, [{}]", availabilityChangeEvent.getState().toString());
    }
}
