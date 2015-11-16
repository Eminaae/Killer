package predavanjaS04D04;

public class Test {
	public static void getOlderPerson(String[] p1, String[] p2) {
		if (Integer.parseInt(p1[2]) > Integer.parseInt(p2[2])) {
			printer(p2);
		} else {
			printer(p1);
		}
	}

	public static void getOlderPersonObject(Person p1, Person p2) {
		Integer ageDiff;
		if (p1.yearofBirth > p2.yearofBirth) {
			ageDiff = p1.yearofBirth - p2.yearofBirth;
			//printerObject(p2, ageDiff);
			bitPrint(p2, p1, ageDiff);
		} else {
			ageDiff = p2.yearofBirth - p1.yearofBirth;
			//printerObject(p1, ageDiff);
			bitPrint(p1, p2, ageDiff);
		}
	}

	public static void printer(String[] printable) {
		System.out.println("Starija osoba je : ");
		System.out.println("Ime: " + printable[0]);
		System.out.println("Prezime: " + printable[1]);
		System.out.println("Godina rodjenja: " + printable[2]);
		System.out.println("Adreasa stanovanja: " + printable[3]);
		System.out.println("Broj LK: " + printable[4]);

	}

	public static Integer getAgeDiff(Person p1, Person p2) {
		Integer ageDiff;
		if (p1.yearofBirth > p2.yearofBirth) {
			ageDiff = p1.yearofBirth - p2.yearofBirth;
		} else {
			ageDiff = p2.yearofBirth - p1.yearofBirth;
		}
		return ageDiff;
	}

	public static void printerObject(Person printable, Integer ageDifference) {
		System.out.println("Starija osoba je : ");
		System.out.println("Ime: " + printable.firstName);
		System.out.println("Prezime: " + printable.lastName);
		System.out.println("Godina rodjenja: " + printable.yearofBirth);
		System.out.println("Adreasa stanovanja: " + printable.address);
		System.out.println("Broj LK: " + printable.persolnalid);
	}
	
	public static void bitPrint (Person p1, Person p2,  Integer ageDiff) {
		System.out.printf("Osoba %s %s rodjena %d, koja zivi u %s je starija %d godina od osobe %s %s, rodjene %d, koja zivi u %s.", p1.firstName, p1.lastName, p1.yearofBirth, p1.address, ageDiff, p2.firstName, p2.lastName, p2.yearofBirth, p2.address );
	}
}
