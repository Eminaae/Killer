import java.util.Arrays;

public class StudentsInfo {

	public static void main(String[] args) {

		for (int i = 0; i < 21; i++) {
			System.out.println("Ucenik : " + getNames() [i]);
			for(int j =0; j < 12; j++) {
				System.out.print("(" + returnGrades()[i][j]+ ") ");
				
				System.out.println(getCourses()[j] );
			
			}
		}
	}

	/**
	 * Reading information from file names.in
	 * 
	 * @return name, space, first letter of last name and dot
	 */
	public static String[] getNames() {

		TextIO.readFile("src/names.in");
		String name1 = "";
		int counter = 0;
		while (!TextIO.eof()) {
			name1 = TextIO.getln();
			counter++;
		}
		TextIO.readFile("src/names.in");
		String[] name = new String[counter];
		while (!TextIO.eof()) {
			for (int i = 0; i < name.length; i++) {
				name[i] = TextIO.getln();
			}

		}
		return name;
	}

	public static int[][] returnGrades() {
		TextIO.readFile("src/grades.in");
		int n = TextIO.getInt();
		int m = TextIO.getInt();

		int[][] gradesArray = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				gradesArray[i][j] = TextIO.getInt();
			}
		}
		return gradesArray;
	}

	public static String[] getCourses(){
	
	TextIO.readFile( "src/Courses.in" );
	String courses1 = "";
	int counter = 0;
	
	while(!TextIO.eof()){
		courses1 = TextIO.getln();
		counter++;
	}
	
	String [] courses = new String[counter];
	TextIO.readFile( "src/Courses.in" );
	
	for( int i = 0; i < courses.length; i++ ){
		
		courses[i] = TextIO.getln();
		
	}
	return courses;
	}
	
}


