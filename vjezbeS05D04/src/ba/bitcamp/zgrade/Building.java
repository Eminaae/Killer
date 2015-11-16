package ba.bitcamp.zgrade;

public class Building {
	public String location;
	public Integer population;
	public Integer area;
	
	public double getPopulationDensity () {
		return (double) population / area;
	}
	public void printInformation () {
		System.out.println("Okay. This is a simple buliding.");
		System.out.println("It has");
	}
	

}
