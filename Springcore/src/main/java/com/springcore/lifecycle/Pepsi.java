package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	// this is init method only
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init :pepsi");
	}
	// this is destory method only
	public void destroy() throws Exception {
		System.out.println("inside destory :pepsi");
		
	}
	
}
