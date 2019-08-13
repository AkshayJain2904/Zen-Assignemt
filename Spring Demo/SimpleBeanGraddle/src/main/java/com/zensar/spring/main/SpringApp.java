package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.simple.Greeting;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("greetings.xml");
		Greeting greeting=applicationContext.getBean("diwali",Greeting.class);
		System.out.println(greeting.sayGreet());
	}
}
