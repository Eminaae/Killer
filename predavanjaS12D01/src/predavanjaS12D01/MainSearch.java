package predavanjaS12D01;

import java.util.Scanner;

public class MainSearch {

	public static void main(String[] args) {
		
		System.out.println("Enter search: ");
		
		Scanner in = new Scanner(System.in);
		String serachString = in.nextLine();
		
		
		Search s  = new Search (serachString);
		s.startSearch();
		
		
		in.close();
	}

}
