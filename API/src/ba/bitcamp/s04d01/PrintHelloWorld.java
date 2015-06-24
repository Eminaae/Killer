package ba.bitcamp.s04d01;

import java.util.Scanner;

public class PrintHelloWorld {
	
	public static void main(String[] args) {
		
		int sum = 0;
		System.out.printf("Suma je: %d \n",sum);
		for(String arg : args){ //konveryija varijable arg tipa string u integer
		int number = Integer.parseInt(arg);
		sum = sum + number;
			
		}System.out.println("Sum of all numbers in array: " +sum);
		
		
		//sayHello();
		//sayHello("Kris");
/*		if(args.length == 0){
			System.out.println("Usage: Hello.jar Name1, Name 2 ... ");
		}else{
//		for(int i = 0; i < args.length; i++){
//			sayHello(args[i]);
			}
		for (int i = 0; i < args.length; i++){   //ova ima 4 naredbe, foreach je efikasnija
			String name = args [i];
			sayHello(name);
		}
		for(String name : args){
			sayHello (name);
		}
*/		
		
		
		//
		//sum.indexOf(str)
		}
		
		
		
					
			
		}	
		
		
/*		String name;
		name = args[0];
		sayHello(name);
		name = args[1];
		sayHello(name);
		name = args[2];
		sayHello(name);
		
	}
		
	/**
	 * Prints hello world to the screen.
	 * <p>
	 * Sends string "Hello, world!" to the standard output.
	 * 
	 */
/*	public static void sayHello() {
			System.out.println("Hello, world!");
	}
	/**
	 * Greets a user by name.
	 * 	
	 * @param name Name of a user to greet.
	 */
	/*public static void sayHello(String name){
			System.out.printf("Hello, %s!\n", name);*/
			



