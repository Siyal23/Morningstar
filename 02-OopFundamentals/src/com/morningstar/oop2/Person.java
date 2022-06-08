package com.morningstar.oop2;

public class Person {
	//instance variables
	private String firstName;
	private String lastName;
	private String city;
	public void getData(String firstName,String lastName,String city) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.city=city;
	}
	public void show() {
		System.out.println("First Name:"+firstName+", "+"Last Name:"+lastName+", "+"City:"+city);
		
	}
	
}
