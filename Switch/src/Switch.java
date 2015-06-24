import java.util.InputMismatchException;
import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a = 0;
	try{
	a = input.nextInt();
	}catch(InputMismatchException ex){//ovaj blok se uradi samo ako se uhvati exception
		System.out.println("Catched");	
		System.exit(0);
	}
	}

}
