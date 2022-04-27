package com.qa.demo;

public class Person {
	
	private int height;
	private String name;
	private int shoesize;
	private String jobtitle;
	private int age;
	
	
	
	public Person(String name, int age, int shoesize, int height, String jobtitle) {
		this.name = name;
		this.age = age;
		this.shoesize = shoesize;
		this.height = height;
		this.jobtitle = jobtitle;
	}
	public Person(String name, int height) {
		this.name = name;
		this.height = height;

	}
	public void specificgreet() {
		System.out.println("Hi, my name is " + name + ", I am " + height + "cm tall.");
	}
	public void greet() {
	System.out.println("Hi, my name is " + name + ", I am " + age + " years old.");
	System.out.println("I am also " + height + "cm tall and have I shoe size of " + shoesize + ". My Job Title is " + jobtitle + ".");
	}
}
 