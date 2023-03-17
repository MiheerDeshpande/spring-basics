package com.springcore.standalone.collections;

import java.util.List;
import java.util.Properties;

public class Person {

	 private List<String> friends;
	 private Properties props;
	 

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", props=" + props + "]";
	}
	 
}
