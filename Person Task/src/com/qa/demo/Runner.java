package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		
		Person Carl = new Person("Carl", 20, 9, 180, "East Ender");
		Person jane = new Person("Jane", 150);
		
		jane.specificgreet();
		Carl.greet();
		
	}

}
