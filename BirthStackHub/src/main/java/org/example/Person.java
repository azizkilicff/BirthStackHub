package org.example;

public class Person {
	private String name;
	private int birthMonth;
	private int birthDay;

	public Person() {
		this.name = "";
		this.birthMonth = 0;
		this.birthDay = 0;
	}

	public Person(String name, int birthMonth, int birthDay) {
		this.name = name;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return name + " " + birthMonth + "/" + birthDay;
	}
}
