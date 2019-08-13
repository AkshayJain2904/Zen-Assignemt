package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApp 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("greetings.xml");
       
       //getting readymade object from Spring IOC conatainer
       Greeting greeting=applicationContext.getBean("birthday", Greeting.class);
       //invoking business logic methode
       System.out.println(greeting.sayGreeting());
       
       Greeting greeting2=applicationContext.getBean("holi", Greeting.class);
       //invoking business logic methode
       System.out.println(greeting2.sayGreeting());
       
       Greeting greeting3=applicationContext.getBean("birthday", Greeting.class);
       
    }
}
