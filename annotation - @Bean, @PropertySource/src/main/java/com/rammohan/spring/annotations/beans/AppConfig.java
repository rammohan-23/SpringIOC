package com.rammohan.spring.annotations.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.rammohan.spring.annotations.beans")
@PropertySource("classpath:person-info.properties")
public class AppConfig {
	@Bean
	public Person getPerson() {
		return new Person();
	}
}
