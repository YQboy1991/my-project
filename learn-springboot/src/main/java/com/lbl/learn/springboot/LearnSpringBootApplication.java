package com.lbl.learn.springboot;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		// 默认
		SpringApplication.run(LearnSpringBootApplication.class, args);

		// 默认等同于
//		ConfigurableApplicationContext run = new SpringApplication(LearnSpringBootApplication.class).run(args);

		// 详细配置见org.springframework.boot.SpringApplication.SpringApplication(org.springframework.core.io.ResourceLoader, java.lang.Class<?>...)
		/*new SpringApplicationBuilder()
				.sources(LearnSpringBootApplication.class)
//				.child(Application.class)
//				.lazyInitialization(true)
				.bannerMode(Banner.Mode.OFF)
//				.logStartupInfo(false)
				.run(args);*/

		// 添加监听, 不能使用@Bean, 为什么?
//		SpringApplication.addListeners()
//		SpringApplicationBuilder.listeners()
		// 使用META-INF/spring.factories, org.springframework.context.ApplicationListener=com.example.project.MyListener
	}

}
