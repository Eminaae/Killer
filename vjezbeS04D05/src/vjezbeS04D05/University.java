package vjezbeS04D05;



public class University {
	String name;
	String city;
	Integer yearOfConstruction;
	Faculty[] faculties;
	
	
	public String toString() {
		String s = "";
		s += "Name: " + name + "\n";
		s += "City: " + city + "\n";
		s += "Year: " + yearOfConstruction + "\n\n";
		for (int i = 0; i < faculties.length; i++) {
			s += faculties[i] + "\n\n";
		}
		
		return s;
	}

}
