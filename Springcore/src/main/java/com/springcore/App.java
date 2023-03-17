package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		/*insantiating a container
		 *now we want bean to give us an object of student1 class
		 *we use Application Context to get the IoC container
		 *as Apllication Context is a interface we need some class to make object
		 *now we use classPathXmlApplicationContext  class to make the object
		 *and then we call get beans method to get the bean object*/
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		/*get bean returns a object of type object which needs to be downcasted into the
		 * required object to work*/
        Student student1 = (Student)context.getBean("student1");
        System.out.println(student1);

        Student student2 = (Student)context.getBean("student2");
        System.out.println(student2);
        
        Student student3 = (Student)context.getBean("student3");
        System.out.println(student3);
    }
}
