/*
 * Godišnja doba
 * Program koji, za dati mjesec, odredi, tj. ispiše na ekran, koje je godišnje doba. Ukoliko neki
 * mjesec ima više godišnje doba uzeti ono koje ima više dana u tom mjesecu. Uraditi preko if i preko switch komandi!
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter month: ");
		Scanner input = new Scanner(System.in);
		int month = 0;
		try {
		 month = input.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Error!");
		}
		
//		if (month == 12 || month == 1 || month == 2) {
//			System.out.println("Winter!");
//		} else if (month == 3 || month == 4 || month == 5) {
//			System.out.println("Spring!");
//		} else if (month == 6 || month == 7 || month == 8) {
//			System.out.println("Summer!");
//		} else if (month == 9 || month == 10 || month == 11) {
//			System.out.println("Authum!");
//		} else {
//			System.out.println ("It' s been nine years of summer, now winter is comming! You are in Game of thrones!");
//		}
		 switch (month) {
		 case 12:
		 case 1:
		 case 2:
			 System.out.println("Winter!");
			 break; 
		 case 3:
		 case 4:
		 case 5:
			 System.out.println("Spring!");
			 break;
		 case 6:
		 case 7:
		 case 8:
			 System.out.println("Summer!");
			 break;
		 case 9:
		 case 10:
		 case 11:
			 System.out.println("Authum!");
			 break;
		default : 
			System.out.println ("It' s been nine years of summer, now winter is comming! You are in Game of thrones!");
			break;
				
		 }
	}

}
