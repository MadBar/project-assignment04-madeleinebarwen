package com.assignment_4.superclasses;

/**
 * This is a class called Human. Has a constructor method, 2 attributes with getters and setters. 
 * 
 * @author Madeleine Barwén
 */
public class Human {

	private String name = "";
	private int age = 0;

	/**
	 * Constructor Method that takes String name and int age as parameters
	 * @param name
	 * @param age
	 */
	public Human(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	/**
	 * Getter Method for name attribute
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter Method for name attribute
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter Method for age attribute
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter Method for age attribute
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
