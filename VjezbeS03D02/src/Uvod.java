import java.util.InputMismatchException;
import java.util.Scanner;
public class Uvod {

	public static void main(String[] args) {
//		int a = 3;
//		
//		switch (a) {
//		case 1 :
//			System.out.println("A je 1");
//			break;
//		case 2: 
//			System.out.println("A ti je 2");
//			break;
//		case 3:
//			System.out.println("A je izgleda  3");
//			break;
//			default : System.out.println("A je nesto drugos");
//			break;
//		}
//		if (a == 1) {
//			System.out.println("A je 1");
//		} else if ( a == 2) {
//			System.out.println("A je 2");
//		} else if (a == 3){
//			System.out.println("A je 3");
//		} else 
//			System.out.println("A je nesto drugo");
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		
		try {
			a = input.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Ha ha! Uhvatili smo te.");
			System.exit(0);
		}
            System.out.println("Ovo radi.");
	}

}
