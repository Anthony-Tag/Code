 package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app")
public class SpringBeanConfiguration {

 	//Any Bean configuration like View, Jdbc, Orm, AOP or any configuration you can add here using @Bean
 }

 //This class is IOC container for your Beans
