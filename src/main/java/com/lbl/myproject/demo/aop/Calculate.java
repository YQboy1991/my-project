package com.lbl.myproject.demo.aop;

/**
 * @author: BaoLei Li
 * @date: 2020/9/30
 **/
public interface Calculate {

    /**
     * 加法
     * @param numA
     * @param numB
     * @return
     */
    int add(int numA,int numB);

    /**
     * 减法
     * @param numA
     * @param numB
     * @return
     */
    int reduce(int numA,int numB);

    /**
     * 除法
     * @param numA
     * @param numB
     * @return
     */
    int div(int numA,int numB);

    /**
     * 乘法
     * @param numA
     * @param numB
     * @return
     */
    int multi(int numA,int numB);
}
