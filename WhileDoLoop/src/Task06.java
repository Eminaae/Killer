import java.util.Scanner;
public class Task06 {

	public static void main(String[] args) {
	
		int num=12321;
		int copy = num;
		int rev=0;
		
		while(num > 0){
			
			int digit=num % 10;
			num = num / 10;
			rev = rev*10 + digit;	
		}
		//System.out.println(num); Unistili smo n pa prvimo na pocetku kopiju copy
		//System.out.println(num);
		
		if (rev==copy){
			System.out.println("Is Palindrome");
		}else{
			System.out.println("Nije Palindrome");
		}
	}

}
