package com.lbl.reactive.domain;

import lombok.*;

/**
 * @author: BaoLei Li
 * @date: 2021/8/18
 **/
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Account {

    private Long id;
    private String accountCode;
    private String accountName;
}
