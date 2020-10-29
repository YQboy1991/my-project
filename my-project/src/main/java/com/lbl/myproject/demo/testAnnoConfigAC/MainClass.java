package com.lbl.myproject.demo.testAnnoConfigAC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.Period;

/**
 * @author: BaoLei Li
 * @date: 2020/7/5
 **/
@Component
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(person);

    }
}
