package ba.bitcamp.week4.structures;

public class University {
	String name;
	String city;
	Integer yearOfConstruction;
	Faculty [] faculties; // first we have to make string in main
	
	//Creating toString method for University
	
	@Override
	public String toString() {
		String s = "";
		s += "Name: " +name + "\n";
		s += "City: " +city + "\n";
		s += "Year: " +yearOfConstruction + "\n";
		
		//help us to print
		
		for(int i = 0; i < faculties.length; i++){
			s += "\n" + faculties[i] + "\n\n"; //add to string faculty
		}
		
		return s;
		
	}
}
