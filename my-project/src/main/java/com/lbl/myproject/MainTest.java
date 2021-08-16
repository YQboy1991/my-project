package com.lbl.myproject;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author: BaoLei Li
 * @date: 2021/8/16
 **/
public class MainTest {

    public static void main(String[] args) {
        Map<String, Integer> map = Maps.newHashMap();
        map.put("1",1);
        map.put("1",2);

        System.out.println(map.get("1"));

    }
}
