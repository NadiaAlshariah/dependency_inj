package com.example.dependency_injection;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext apc = SpringApplication.run(DependencyInjectionApplication.class, args);
		for (String s : apc.getBeanDefinitionNames())
			System.out.println(s);
	}

}
