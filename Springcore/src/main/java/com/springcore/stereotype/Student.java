package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Durgesh Tiwari")
	private String studentName;
	@Value("Delhi")
	private String City;
	@Value("#{temp}")
	private List<String> address;
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", City=" + City + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("inside setter: Name");

		this.studentName = studentName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		System.out.println("inside setter: City");

		City = city;
	}
	public Student(String studentName, String city) {
		super();
		System.out.println("inside constructor: param");
		this.studentName = studentName;
		City = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("inside constructor: no args");

	}
}
