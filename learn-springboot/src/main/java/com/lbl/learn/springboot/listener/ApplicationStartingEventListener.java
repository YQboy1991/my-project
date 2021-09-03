package com.lbl.learn.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author: BaoLei Li
 * @date: 2021/8/26
 **/
@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

    /** logger for ApplicationStartingEventListener */
    private static final Logger logger = LoggerFactory.getLogger(ApplicationStartingEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        log.info(">>>>>applicationStartingEvent is triggered");
        System.out.println(">>>>");
        logger.info(">>>>>applicationStartingEvent is triggered logger");
    }

    public ApplicationStartingEventListener(){
        log.info("<<<<<12334444");
    }
}
