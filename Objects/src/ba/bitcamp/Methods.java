package ba.bitcamp;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 String name=input.nextLine();
	 System.out.println("What is your name?");
	 
	 for(int i=0; i<name.length(); i++){
		 System.out.println(name.charAt(i));
		 
	 }

	}

}
