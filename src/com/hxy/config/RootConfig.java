package com.hxy.config;

import org.hibernate.SessionFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@ComponentScan(basePackages={"com.hxy.controller","com.hxy.pojo","com.hxy.exception","com.hxy.model","com.hxy.service"},
			excludeFilters={@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})
//@ImportResource("classpath:spring-servlet.xml")
@ImportResource("classpath:spring-servlet.xml")
public class RootConfig {

	//国家化
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = 
				new ResourceBundleMessageSource();
		messageSource.setBasename("message");
		return messageSource;
	}
}
