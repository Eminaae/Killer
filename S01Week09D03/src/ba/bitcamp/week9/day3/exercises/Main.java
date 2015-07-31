package ba.bitcamp.week9.day3.exercises;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Planet[] pl = new Planet[4];
		pl[0] = new Planet("Mars", 0.532, 0.107, 1.524);
		pl[1] = new Planet("Uranus", 4.01, 14.6, 19.19);
		pl[2] = new Planet("Mercury", 0.382, 0.055, 0.387);
		pl[3] = new Planet("Jupiter", 11.19, 317.8, 5.203);
		
		Planet.sortByName(pl);
		System.out.println(Arrays.toString(pl));
		
		Planet.sortByDiameter(pl);
		System.out.println(Arrays.toString(pl));
		
		Planet.sortByDistance(pl);
		System.out.println(Arrays.toString(pl));
		
		Planet.sortByMass(pl);
		System.out.println(Arrays.toString(pl));

	}

}
