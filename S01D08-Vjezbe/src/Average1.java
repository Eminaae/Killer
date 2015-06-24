import java.util.Scanner;
//Unositi brojeve sa konyole sa skenerom . Kad se unese -1 na ekran se ispise AVG

public class Average1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj:");
		double num;
		double sum = 1;
		int i = 0; //counter
		
		do{
		 num = in.nextDouble();
		 sum +=num;
		 i++;
		}while (num !=-1);
	    i--;
		
		System.out.println(sum/i);
		

	}

}
