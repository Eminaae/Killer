import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatchNumber {

	public static void main(String[] args) {
/*		Scanner in = new Scanner(System.in);
		int number;
		
			while (true){
				try{ 
					System.out.println("Unesi cijeli broj");
					number=in.nextInt();
							break;
				}catch (InputMismatchException e){ //izvrsava se sve dok ne dodje do exception
					System.out.println("Nije broj");
					in.nextLine(); //Da bismo ako pogresno unesemo slovo ocistimo input
				}
			}
	}
		
}

/**
Stalno ispisuje unesi broj, nije broj ako unesemo sloveo, jer pamti to slovo i opet 
pokusava procitati slovo i vraca ga do beskonacnosti*/
	
/**
 * Za dva broja
 * NIKAD try unutar catch!
 */
public static int getInput(){
	Scanner in = new Scanner(System.in);
	int number = 0;
	while (true){
		try{ 
			System.out.println("Unesi cijeli broj");
			number=in.nextInt();
					break;
		}catch (InputMismatchException e){ //izvrsava se sve dok ne dodje do exception
			System.out.println("Nije broj");
			in.nextLine(); //Da bismo ako pogresno unesemo slovo ocistimo input
		}
	}
	
	return number;
}
	}
