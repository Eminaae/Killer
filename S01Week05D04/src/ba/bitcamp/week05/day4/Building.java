package ba.bitcamp.week05.day4;

public class Building {
	public String location;
	public Integer population;
	public Integer area;

	public Building(String location, Integer population, Integer area) {
		super();
		this.location = location;
		this.population = population;
		this.area = area;
	}

	public double getPopulationDensity(){
		return (double) population /area;
	}
	
	public void printInformation(){
		//printa informacije vezane za zgradu
		System.out.println("This is a simple building");
	}

}
