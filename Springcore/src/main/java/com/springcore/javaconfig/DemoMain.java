package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DemoMain {
public static void main(String[] args) {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	Student s1 = (Student)context.getBean("con");
	System.out.println(s1);
	s1.study();
	
	
}
}
