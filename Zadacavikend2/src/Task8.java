import java.util.Scanner;


public class Task8 {

	public static void main(String[] args) {
		System.out.println("Input string: ");
		Scanner input = new Scanner (System.in);
		String str = input.next();
		input.close();
		
		int length = str.length ();
		String page = "";
		//int counter = 0;
	
		for (int i = 7; i < length; i++  ) {
			char character1 = str.charAt(i);
			if (character1 != '/') {
				page += character1;
				//counter++;
			}
			else break;
		}
		System.out.println(page);
		
	}

}
