package com.app2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app2.beans.Motor;

public class AutowireTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/app2/config/application-context.xml");
		Motor motor = (Motor) ctx.getBean("motor1");

		motor.run();

	}

}
