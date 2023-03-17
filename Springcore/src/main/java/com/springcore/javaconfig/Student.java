package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

/*@Component("firststudent") not required as wee are using bean annotation*/
public class Student {
	
	private Samosa samosa;
	

	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.display();
		System.out.println("student is studying");
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
}
