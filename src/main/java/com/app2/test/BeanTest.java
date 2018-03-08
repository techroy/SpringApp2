package com.app2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app2.beans.GreetService;
import com.app2.config.ApplicationConfiguration;

public class BeanTest {

	public static void main(String[] args) {
		
		
	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class) ;
	
	GreetService greetService = (GreetService)ctx.getBean("greet");
	
	greetService.wish();

	}

}
