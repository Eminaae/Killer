import java.util.InputMismatchException;
import java.util.Scanner;


public class Task02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "";
		
		try{
			int a = in.nextInt();
			System.out.println(a);
		}catch (InputMismatchException e){
			System.out.println(e.getMessage());
			System.out.println("Input int format");
	}
	}
}
