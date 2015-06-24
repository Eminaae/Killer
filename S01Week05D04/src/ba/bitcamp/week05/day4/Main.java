package ba.bitcamp.week05.day4;

public class Main {

	public static void main(String[] args) {
		Building b = new Building();
		b.area = 100;
		b.location ="Hrasnicka cesta";
		b.area = 123;
		
		University u = new University();
		u.area = 500;
		u.location = "Dolina";
		u.population = 1200;
		u.name = "IUS";
		u.isItPublic = false;
		u.NumberOfFaculties = 3;
		u.numberOfStaff = 200;
		System.out.println(u.getPopulationDensity());
		
		Hospital h = new Hospital();
		h.area = 100;
		h.hasCTMachine = false;
		u.isItPublic = false;
		h.location = "none";
		h.numberOfBeds = 100;
		h.numberOfSurgeons = 1;
		h.population = 20;
		
		Jail j = new Jail();
		j.area = 100;
		j.hasGym = true;
		j.numberOfCells = 100;
		
		KPDom k = new KPDom();
		k.numberOfDoctors = 1;
		
		
		System.out.println(j.getPopulationDensity());
		System.out.println(j.getNumberOfOccupiedCells());
		u.printInformation();
		

	}

}
