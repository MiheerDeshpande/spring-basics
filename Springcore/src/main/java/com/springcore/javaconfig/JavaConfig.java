package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* @ComponentScan(basePackages = "com.springcore.javaconfig")  dont requrire as we are using bean annotation*/
public class JavaConfig {

	/*
	 * it indicates to the spring container that whatever this method returns needs
	 * to be remembered as an object cuz in future any class can demand the object
	 * in future as when we declare get bean in main method it uses is object directly 
	 * or if this object is required as a reference to a field in instantiating any other object
	 * 
	 * 
	 * bean name would be same as the method name
	 */
	@Bean(name= {"student","temp","con"})// set multiple bean aliases for getStudent bean
	// by default bean name is same as method name
	public Student getStudent() {
		// creating a student objct
		Student student = new Student(getSamosa());
		return student;
	}
	
	
	/*
	 * this is the replacement of autowiring cuz we are injecting the samosa into
	 * student object
	 */
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
}
