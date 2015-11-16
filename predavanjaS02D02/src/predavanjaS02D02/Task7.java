package predavanjaS02D02;

import java.util.Scanner;

//kod koji na konzoli sipisuje tablicu mnozenja
public class Task7 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Unos: ");
		int m = in.nextInt();
		int n = in.nextInt();
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				//System.out.print( i * j + " ");
				System.out.printf("%2d ", i*j);
		    }
				System.out.println();
		
		
		}
		
		
		
		in.close();
	}

}
