package com.bitcamp.klase.model;

public class Person {
// pretvaramo niz u klasu
	public String firstName;
	public String lastName;
	public Integer yearOfBirth;
	public String adress;
	public String personalId;
	public String email;
	public Integer height;
	public boolean isValid;
	public String favFood;
	public String favDrink;
	
	
	public Person(String firstName, String lastName, Integer yearOfBirth,
			String adress, String personalId, String email, Integer height,
			boolean isValid, String favFood, String favDrink) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.adress = adress;
		this.personalId = personalId;
		this.email = email;
		this.height = height;
		this.isValid = isValid;
		this.favFood = favFood;
		this.favDrink = favDrink;
	}
}
