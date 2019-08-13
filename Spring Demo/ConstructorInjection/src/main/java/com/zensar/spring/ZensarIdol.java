package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performance.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdol 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext=new ClassPathXmlApplicationContext("performers.xml");
      Performer performer=applicationContext.getBean("Mahesh", Performer.class);
      performer.perform();
      System.out.println("----------------");
      Performer performer2=applicationContext.getBean("Reema Mehra", Performer.class);
      performer.perform();
      
    }
}
