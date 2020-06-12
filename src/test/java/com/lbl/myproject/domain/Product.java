package com.lbl.myproject.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author: BaoLei Li
 * @date: 2020/5/19
 **/
@Data
@RequiredArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Type type;

    public static enum Type{
        K12, KAOYAN, CHUGUO
    }
}
