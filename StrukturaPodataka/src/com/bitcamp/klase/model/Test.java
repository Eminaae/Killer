package com.bitcamp.klase.model;

public class Test {
/**
 * Method that calculate who is older
 */
	

	public static void getOlderPerson(String[] p1, String[] p2){
		if(Integer.parseInt(p1[2]) > Integer.parseInt( p2[2])){
			printer(p1);			
		}else{
			printer(p2);
		}
	}
	
	
	public static void getOlderPerson(Person p1, Person p2){
		Integer ageDiff;
		
		if(p1.yearOfBirth > p2.yearOfBirth){
			ageDiff = p1.yearOfBirth - p2.yearOfBirth;	
			//printerObject(p2,ageDiff);		
			bitPrint(p2,p1,ageDiff);
		}else{
			ageDiff = p2.yearOfBirth - p1.yearOfBirth;
			bitPrint(p1,p2,ageDiff);
		}
	}
	
	
	public static void bitPrint(Person p1, Person p2, Integer ageDiff){
		System.out.printf("%s %s rodjena %d, koja zivi u %s je starija %d godina od %s %s, rodjene %d, koja zivi u %s",
				p1.firstName,p1.lastName,p1.yearOfBirth,p1.adress,ageDiff,p2.firstName,p2.lastName,p2.yearOfBirth,p2.adress);
		
	}
	
	
	
	public static void printerObject(Person printable, Integer ageDifference){
		
		System.out.println("Starija osoba");
		System.out.println("Ime:" + printable.firstName);
		System.out.println("Prezime:" + printable.lastName);
		System.out.println("Godina rodenja:" + printable.yearOfBirth);
		System.out.println("Adres:" + printable.adress);
		System.out.println("Broj LK:" + printable.personalId);
		System.out.println("Broj LK:" + printable.email);
		
		
	}
	
	
	
	public static void printer(String[] printable){
		System.out.println("Starija osoba");
		System.out.println("Ime:" + printable[0]);
		System.out.println("Prezime:" + printable[1]);
		System.out.println("Godina rodenja:" + printable[2]);
		System.out.println("Adres:" + printable[3]);
		System.out.println("Broj LK:" + printable[4]);
		
		
	}
}
