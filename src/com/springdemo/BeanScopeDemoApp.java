package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container 
		Coach thecoach=context.getBean("myCoach",Coach.class);
		
		Coach alphacoach=context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		
		boolean result = (thecoach == alphacoach);
		
		System.out.println("Result : "+result);
		
		System.out.println("Memory loaction for theCoach : "+thecoach);
		
		System.out.println("Memory loaction for alphaCoach : "+alphacoach);
		
		context.close();
	}

}
