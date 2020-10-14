package com.lbl.myproject.demo.proxy;

import com.lbl.myproject.demo.proxy.dao.UserDao;
import com.lbl.myproject.demo.proxy.dao.UserDaoImpl;
import com.lbl.myproject.demo.proxy.util.ProxyUtil;

/**
 * @author: BaoLei Li
 * @date: 2020/10/14
 **/
public class MainTest {

    public static void main(String[] args) {
        UserDao userDao = (UserDao)ProxyUtil.newInstance(new UserDaoImpl());
        String aaa = userDao.haha("aaa传入的");
        System.out.println("main打印返回结果" + aaa);
    }
}
