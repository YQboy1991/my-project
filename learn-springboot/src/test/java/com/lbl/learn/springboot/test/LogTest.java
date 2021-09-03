package com.lbl.learn.springboot.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: BaoLei Li
 * @date: 2021/9/2
 **/
@SpringBootTest
//@RunWith
public class LogTest {

    /** logger for LogTest */
    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void contextLoad(){
        logger.trace(">>>trace log");
        logger.debug(">>>debug log");
        logger.info(">>>info log");
        logger.warn(">>>warn log");
        logger.error(">>>error log");
    }
}
