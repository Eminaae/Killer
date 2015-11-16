package vjezbeS09D03;

import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {

	public static final double earthMass = 5.97E24;

	private String name;
	private double diameter;
	private double mass;
	private double distance;

	/**
	 * @param diameter
	 * @param mass
	 * @param distance
	 */
	public Planet(String name, double diameter, double mass, double distance) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distance = distance;
	}

	@Override
	public int compareTo(Planet p) {
		return this.name.compareTo(p.name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Planet: " + name + ", " + diameter + " km, " + mass
				+ " earthMass, " + distance + " AU";
	}

	/**
	 * Sorting by diameter
	 * 
	 * @param array
	 */
	public static void sortByDimaeter(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return Double.compare(p2.diameter, p1.diameter);
			}
		});
	}

	/**
	 * Sorting by mass
	 * 
	 * @param array
	 */
	public static void sortByMass(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return Double.compare(p2.mass, p1.mass);
			}
		});
	}

	/**
	 * Sorting by AU
	 * 
	 * @param array
	 */
	public static void sortByAU(Planet[] array) {
		Arrays.sort(array, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return Double.compare(p2.distance, p1.distance);
			}
		});
	}

	public static void main(String[] args) {
		Planet[] planets = { new Planet("Vnera", 7000, 2, 1000.53),
				new Planet("Uran", 345.67, 4, 58786.90) };

		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));

		sortByDimaeter(planets);
		System.out.println(Arrays.toString(planets));

		sortByMass(planets);
		System.out.println(Arrays.toString(planets));

		sortByDimaeter(planets);
		System.out.println(Arrays.toString(planets));
	}
}
