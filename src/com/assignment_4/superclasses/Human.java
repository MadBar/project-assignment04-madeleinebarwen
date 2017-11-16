package com.assignment_4.superclasses;

/**
 * @author Maaaads
 *
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
		// auto: super();
		this.setName(name);
		this.setAge(age);
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
