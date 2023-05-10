package com.baido.QLBD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.baido.QLBD", "com.baido.QLBD.api",
		"com.baido.QLBD.dbo", "com.baido.QLBD.entity", "com.baido.QLBD.Controller", "com.baido.QLBD.Repository"})
public class QlProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(QlProjectApplication.class, args);
	}

}
