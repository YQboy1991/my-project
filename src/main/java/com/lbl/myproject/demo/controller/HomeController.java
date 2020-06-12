package com.lbl.myproject.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: BaoLei Li
 * @date: 2020/5/19
 **/
@RestController
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        return "home";
    }

}
