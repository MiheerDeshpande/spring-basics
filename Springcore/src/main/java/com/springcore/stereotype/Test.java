package com.springcore.stereotype;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student s1 = context.getBean("student", Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddress());
		
		
		
		 	SpelExpressionParser temp = new SpelExpressionParser(); 
			Expression expression  = temp.parseExpression("T(java.lang.Math).sqrt(25)"); 
			System.out.println(expression.getValue());

	}

}
