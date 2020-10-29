package com.lbl.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        // 445333
        ConfigurableApplicationContext run = SpringApplication.run(MyProjectApplication.class, args);
        System.out.println("run qi lai le~");
    }

}
