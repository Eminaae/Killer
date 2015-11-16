package predavanjaS09D01;

import java.util.Scanner;

public class TripPlanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Place head = null;
		Place last = null;
		
		System.out.println("Enter your location: ");
		Place from = new Place(s.nextLine());
		Trip t = new Trip(from);
		
		System.out.println("Enter next location: ");
		
		while (true) {
			String n = s.nextLine();
			if (!n.equals("")){
				Place newPlace = new Place(n);
				
				if (head == null && last == null) {
					head = newPlace;
					last = newPlace;
				} else {
					last.setNext(newPlace);
					last = newPlace;
				}
			} else {
				break;
			}
		}
		
		System.out.println("Here your trip details: ");
		System.out.print(t);
		
		s.close();
	}
}
