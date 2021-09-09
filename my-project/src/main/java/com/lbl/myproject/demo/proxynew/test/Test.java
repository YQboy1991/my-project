package com.lbl.myproject.demo.proxynew.test;


import com.lbl.myproject.demo.proxynew.dao.LubanDao;
import com.lbl.myproject.demo.proxynew.dao.LubanDaoImpl;
import com.lbl.myproject.demo.proxynew.util.LubanInvocationHandler;
import com.lbl.myproject.demo.proxynew.util.ProxyUtil;
import com.lbl.myproject.demo.proxynew.util.TestCustomHandler;
//import sun.misc.ProxyGenerator;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;


public class Test {
    public static void main(String[] args) {
          //自定义
        LubanDao proxy = (LubanDao) ProxyUtil.newInstance(LubanDao.class,new TestCustomHandler(new LubanDaoImpl()));
        try {
            proxy.proxy();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 使用ProxyGenerator生成字节码字节数组
//        byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy18",new Class[]{LubanDao.class});
//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lbl/$Proxy18.class");
//            fileOutputStream.write(bytes);
//            fileOutputStream.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //        System.out.println(proxy.proxy());
//        LubanDao jdkproxy = (LubanDao) Proxy.newProxyInstance(Test.class.getClassLoader(),
//                new Class[]{LubanDao.class},new LubanInvocationHandler(new LubanDaoImpl()));
//
//        //jdkproxy.query();
//        try {
//            jdkproxy.proxy();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
