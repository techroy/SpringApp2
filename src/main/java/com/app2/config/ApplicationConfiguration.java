package com.app2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app2.beans.GreetService;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="greet")
	public GreetService getGreetService(){
		
		return new GreetService();
	}
}
