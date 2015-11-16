package ba.bitcamp.zgrade;

public class Main {

	public static void main(String[] args) {
		
		Building b = new Building ();
		b.area = 1000;
		b.location = "Butmirska BB";
		b.population = 1000;
		
		University u = new University ();
		u.area = 500;
		u.location = "Hrasnicka cesta 17";
		u.population = 1200;
		u.isItPublic = false;
		u.numberOffFaculty = 3;
		u.numberOfStaff = 200;
		u.printInformation();
		
		Hospital h = new Hospital ();
		h.area = 100;
		h.location = "";
		h.population = 200;
		h.numberOfSurgeons = 12;
		h.numberOfBeds = 23;
		h.hasCTMashine = true;
		h.isItPublic = true;
		
		KPDom k = new KPDom();
		
		
		Jail j = new Jail ();
		j.area = 400;
		j.location = "";
		j.population = 200;
		j.numberOfCells = 50;
		j.numberOfFreeCells = 12;
		j.securityLevel = 4;
		j.hasGym = true;
		
		
	}

}
