package ba.bitcamp.week9.day3.exercises;

import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet>{
	
	//private static final long EARTH = 59724;
	
	private String name;
	private Double diameter;
	private Double mass;
	private Double distance;
			

	/**
	 * Constructor
	 * @param name
	 * @param diameter
	 * @param mass
	 * @param distance
	 */
	public Planet(String name, Double diameter, Double mass, Double distance) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distance = distance;
	}
		

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getDiameter() {
		return diameter;
	}


	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}


	public Double getMass() {
		return mass;
	}


	public void setMass(double mass) {
		this.mass = mass;
	}


	public Double getDistance() {
		return distance;
	}



	public void setDistance(double distance) {
		this.distance = distance;
	}

	 

	@Override
	public String toString() {
		return  name + " " + diameter + "[km] " +  mass + " " + distance + " [AU]";
	}


	public static void sortByName(Planet[] array){
		Arrays.sort(array, new Comparator <Planet>(){

			@Override
			public int compare(Planet p1, Planet p2) {
				
				return p1.name.compareTo(p2.name);
			}	
			
		});		
	}
	
	
	public static void sortByDiameter(Planet[] array){
		Arrays.sort(array, new Comparator <Planet>(){

			@Override
			public int compare(Planet p1, Planet p2) {
				
				return Double.compare(p1.diameter, p2.diameter);
 			}	
			
		});		
	}
	
	
	public static void sortByDistance(Planet[] array){
		Arrays.sort(array, new Comparator <Planet>(){

			@Override
			public int compare(Planet p1, Planet p2) {
				
				return Double.compare(p1.distance, p2.distance);
 			}	
			
		});		
	}
	
	public static void sortByMass(Planet[] array){
		Arrays.sort(array, new Comparator <Planet>(){

			@Override
			public int compare(Planet p1, Planet p2) {
				
				return Double.compare(p1.mass, p2.mass);
 			}	
			
		});		
	}


	@Override
	public int compareTo(Planet p) {
		if(this.diameter != p.diameter ){
			return (int) (p.diameter - this.diameter);
	}else{
		return this.name.compareTo(p.name);
		}
	}

}
