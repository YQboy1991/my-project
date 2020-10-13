package com.lbl.myproject.demo.testAnnoConfigAC;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: BaoLei Li
 * @date: 2020/7/5
 **/
@Component
@Data
//@Scope("prototype")
public class Person {

    private String name = "zhangsan";

//    @Autowired
//    private Dog dog;


}
