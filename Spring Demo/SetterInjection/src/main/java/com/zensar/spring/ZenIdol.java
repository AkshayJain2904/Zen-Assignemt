package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performer.Performer;

public class ZenIdol 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("performers.xml");
       Performer performer=applicationContext.getBean("Tina", Performer.class);
       performer.perfom();
    }
}