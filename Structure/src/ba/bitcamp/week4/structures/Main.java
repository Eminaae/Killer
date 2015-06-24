package ba.bitcamp.week4.structures;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		University u1 = new University(); // have to make University than change attr
		u1.name = "UNSA";
		u1.city = "Sarajevo";
		u1.yearOfConstruction = 1949;
		//after we create Faculty we need to change new String to new Faculty
		/*u1.faculties = new String [3];
		u1.faculties[0] = "Pravni Fakultet";
		u1.faculties[1] = "Sumarski Fakultet";
		u1.faculties[2] = "Saobracajni fakultet";*/
		
		u1.faculties = new Faculty [3];  //how many faculties we are going to have, create string
		u1.faculties[0] = new Faculty();
		u1.faculties[0].name = "Pravni fakultet";
		u1.faculties[0].isBologna= true;
		
		u1.faculties[0].departments= new String[2]; 
		u1.faculties[0].departments[0] = "Krivicno pravo";
		u1.faculties[0].departments[1] = "Notarski odsjek";
		
		//First we have to create faculty
		u1.faculties[1]= new Faculty();
		u1.faculties[1].name = "Elektotehnicki";
		u1.faculties[1].isBologna = true;
		u1.faculties[1].departments = new String[2];
		u1.faculties[1].departments[0]= "Telekomunikacije";
		u1.faculties[1].departments[1]= "Energetika";
		/*
		System.out.println(u1.name);
		System.out.println(u1.city);
		System.out.println(u1.yearOfConstruction);
		System.out.println(Arrays.toString(u1.faculties));;
		*/
		
		/*System.out.println(u1.faculties[1].name); //we have university1, that has faculties, whoes have names, departments etc
		System.out.println(u1.faculties[1].isBologna);
		System.out.println(u1.faculties[1].departments[0]);
		System.out.println(u1.faculties[1].departments[1]);*/
		
		//Above will print everything...instead od 4 lines of code, we can use only one
		System.out.println(u1.faculties[0]); // invites toString method that we need to create in Faculty class
		System.out.println();
		System.out.println(u1);

	}

}
