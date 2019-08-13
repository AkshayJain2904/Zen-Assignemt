package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(GreetingConfig.class);
        Greeting greeting=applicationContext.getBean("anniversary",AnniversaryGreeting.class);
        System.out.println(greeting.sayGreeting());
        
    }
}
