package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("greetings.xml");
       //Greeting greeting=(Greeting) ctx.getBean("festivalGreeting");  //the below line is same as this line
       Greeting greeting=ctx.getBean("festival",FestivalGreeting.class); 
       System.out.println(greeting.sayGreeting());
    }
}
