package com.lbl.myproject.demo.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.aop.support.AopUtils;

/**
 * @author: BaoLei Li
 * @date: 2020/9/30
 **/
//public class LblCalculate implements Calculate{
public class LblCalculate{

//    @Override
    public int add(int numA, int numB) {
//        ((LblCalculate)AopContext.currentProxy()).haha();
        ((LblCalculate)AopContext.currentProxy()).haha();

        return numA+numB;
    }

    public void haha(){
        System.out.println("hahahah");
    }

//    @Override
    public int reduce(int numA, int numB) {
        return numA-numB;
    }

//    @Override
    public int div(int numA, int numB) {
        return numA/numB;
    }

//    @Override
    public int multi(int numA, int numB) {
        return numA*numB;
    }
}
