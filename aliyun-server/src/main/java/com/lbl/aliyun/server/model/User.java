package com.lbl.aliyun.server.model;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author: BaoLei Li
 * @date: 2021/8/20
 **/
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@XmlRootElement
public class User {

    private Integer id;
    private String name;
    private Integer age;
}
