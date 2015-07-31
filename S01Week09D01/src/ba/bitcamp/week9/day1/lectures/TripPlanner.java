package ba.bitcamp.week9.day1.lectures;

import java.util.Scanner;

public class TripPlanner {

	public static void main(String[] args) {
		System.out.println("What is the place you would like to visit");
		Scanner s = new Scanner(System.in);
		Trip t = new Trip();
		
		while (true) {
			String placeName = s.nextLine();
			
			if (!placeName.equals("")) {
				t.add(new Place(placeName));
			} else {
				break;
			}

		}
		System.out.println("Na vasem putu cete proci kroz sljeeca mjesta: ");
		System.out.println(t);
		
	}
}
