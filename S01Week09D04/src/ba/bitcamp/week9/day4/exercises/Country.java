package ba.bitcamp.week9.day4.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Country {

	public enum Sort {NAME, POPULATION, AREA}
	private String name;
	private Integer population;
	private Integer area;
	


	/**
	 * Constructor
	 * @param name
	 * @param population
	 * @param area
	 */
	public Country(String name, int population, int area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPopulation() {
		return population;
	}



	public void setPopulation(int population) {
		this.population = population;
	}



	public int getArea() {
		return area;
	}



	public void setArea(int area) {
		this.area = area;
	}
	

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population
				+ ", area=" + area + "]";
	}





	private void sorting(ArrayList<Country> list, Sort s){
		
		if( s == Sort.AREA){
			
		list.sort(new Comparator<Country>() {

			@Override
			public int compare(Country o1, Country o2) {
				
				return o1.area.compareTo(o2.area);
			}
			
			
		});
		}
		
		if(s == Sort.POPULATION){
			list.sort(new Comparator<Country>(){

				@Override
				public int compare(Country o1, Country o2) {
					
					return o1.population.compareTo(o2.population);
				}
				
			});
		}
		
		if(s == Sort.NAME){
			list.sort(new Comparator<Country>(){

				@Override
				public int compare(Country o1, Country o2) {
					
					return o1.name.compareTo(o2.name);
				}
				
			});
		}
	}
	
	public static void main(String[] args){
		Sort s1 = Sort.AREA;
		Sort s2 = Sort.NAME;
		Sort s3 = Sort.POPULATION;
		
		Country c1 = new Country("BiH",1300, 50);
		Country c3 = new Country("CRO",300, 780);
		
		ArrayList<Country> list = new ArrayList<>();
		
		list.add(c3);
		list.add(c1);
		
		c1.sorting(list, s1);
		System.out.println(list);
		
		c1.sorting(list, s2);
		System.out.println(list);
		
		c1.sorting(list, s3);
		System.out.println(list);
	}
}
