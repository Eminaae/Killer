package ba.bitcamp.week4.structures1;

import java.awt.Color;

public class Car { //Car is empty constructor, its always present in class
	//we are describing cars as a object
	
	String name;
	Color color;
	int year;
	int HorsePower;
	
/*	Car(String n, int y, int hp, Color c){ //we make constructor
		name = n;
		year = y;
		HorsePower = hp;
		color= c;
		*/
	
	//this will be confusing for Java, because of that we are using this...and java gets the most closer name, year ...
	/*Car(String name, int year, int horsePower, Color color){ //we make constructor
		name = name;
		year = year;
		HorsePower = horsePower;
		color= color;
		*/
	
	Car(String name, int year, int horsePower, Color color){ //we make constructor
		this.name = name;
		this.year = year;
		this.HorsePower = horsePower;
		this.color= color;
	}
}
