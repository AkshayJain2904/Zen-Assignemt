package com.zensar.spring.performer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 05.30PM
 * Modified Date:-29th July 2019 03.40AM
 * Version:3.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-
 * zensar idolIt is used to play instrumentalist.
 * */


public class Instrumentalist implements Performer,BeanNameAware {
	
	private String song;
	private Instrument instrument;
	private String beanName;
	
	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}
	//for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}

	//business logic of instrumentalist
	public void perfom() {
		System.out.println("Instrumentalist "+beanName+" is playing "+song);
		instrument.play();

	}
	public void setBeanName(String name) {
		this.beanName=name;
		System.out.println("bean name is set");
		
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Spring core is Ioc Container BeanFactory is set");
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Spring Specialized IoC container ApplicationContext is Set");
		
	}
	public void afterPropertiesSet() throws Exception {
		//instrument.tune();
		System.out.println("after property set is called");
	}
	public void tuneInstrument() {
		instrument.tune();
		System.out.println("custom init methode");
	}
	public void destroy() throws Exception {
		//instrument.clean();
		System.out.println("destroy methode is called");
		
	}
	public void clearInstrument() {
		instrument.clean();
		System.out.println("custom destroy methode");
	}
}
