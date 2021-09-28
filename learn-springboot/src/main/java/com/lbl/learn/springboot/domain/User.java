package com.lbl.learn.springboot.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lbl.learn.springboot.config.json.CustomJsonSerializer;
import lombok.*;

import java.util.Date;

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

//    @JsonSerialize(using = CustomJsonSerializer.Serializer.class)
//    @JsonDeserialize(using = CustomJsonSerializer.Deserializer.class)
    private Date birthDay;
}
