import java.util.Scanner;


public class ExceptionExercises {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int month = in.nextInt();
		
		if(month >= 3 && month <= 6){
			System.out.println("Spring");
		}

		if(month >= 6 && month <= 9){
			System.out.println("Sommmer");
		}

		if(month >= 9 && month <= 12){
			System.out.println("Winter");
		}

		if(month > 6 && month < 9){
			System.out.println("Authum");
		}
	
		{
	
	switch(month){
	case 1: System.out.println("Winter");
	break;
	case 2: System.out.println("Spring");
	break;
	case 3: System.out.println("Sommer");
	break;
	default: System.out.println("Fall");
	}
}
	}
}




