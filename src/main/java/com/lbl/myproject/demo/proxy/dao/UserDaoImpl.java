package com.lbl.myproject.demo.proxy.dao;

/**
 * @author: BaoLei Li
 * @date: 2020/10/14
 **/
public class UserDaoImpl implements UserDao{

    @Override
    public String haha(String aaa) {
        System.out.println("打印哈哈哈" + aaa);
        return "返回的"+aaa;
    }
}
