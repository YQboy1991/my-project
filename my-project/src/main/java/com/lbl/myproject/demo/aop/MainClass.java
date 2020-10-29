package com.lbl.myproject.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: BaoLei Li
 * @date: 2020/9/30
 **/
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(MainConfig.class);
        LblCalculate calculate = (LblCalculate) config.getBean("calculate");
        int add = calculate.add(2, 4);
        System.out.println("运算结果:" + add);

    }
}
