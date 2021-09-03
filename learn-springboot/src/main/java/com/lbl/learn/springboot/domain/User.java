package com.lbl.learn.springboot.domain;

import lombok.*;

/**
 * @author: BaoLei Li
 * @date: 2021/9/3
 **/
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class User {

    private Integer id;

    private String name;
}
