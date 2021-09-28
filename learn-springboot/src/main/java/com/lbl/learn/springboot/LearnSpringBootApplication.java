package com.lbl.learn.springboot;

import com.lbl.learn.springboot.listener.*;
import javafx.scene.Parent;
import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.util.SocketUtils;

@SpringBootApplication(scanBasePackages = "com.lbl.learn.springboot")
public class LearnSpringBootApplication {

	@Value("${http.port}")
	private Integer port;

    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		// 添加http
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

	// 配置http
	// 官方示例 https://github.com/spring-projects/spring-boot/tree/v1.5.9.RELEASE/spring-boot-samples/spring-boot-sample-tomcat-multi-connectors
	private Connector createStandardConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(port);
		return connector;
	}

	public static void main(String[] args) {
		// 默认
		SpringApplication springApplication = new SpringApplication(LearnSpringBootApplication.class);
//		springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
//		springApplication.addListeners(
//				new ApplicationContextInitializedEventListener(),
//				new ApplicationEnvironmentPreparedEventListener(),
//				new ApplicationFailedEventListener(),
//				new ApplicationPreparedEventListener(),
//				new ApplicationReadyEventListener(),
//				new ApplicationStartedEventListener(),
//				new ApplicationStartingEventListener(),
//				new AvailabilityChangeEventListener()
//		);

		springApplication.run(args);
//		SpringApplication.run(LearnSpringBootApplication.class, args);

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
