
public class TaskZ2 {
	
	public static int getNumberOfHoles (int num) {
		int holes = 0;
		int pom;
		
		do {
			 pom = num % 10;
			 num = num / 10;
			if (pom == 1 || pom == 2 || pom == 3 || pom == 5 || pom == 7){
				holes = holes + 0;
			} else if (pom == 4 || pom == 6 || pom == 9 || pom == 0){
				holes = holes + 1;
			} else 
				holes = holes +2;
		} while ( num > 0);
			return holes;
	}
	public static void main(String[] args) {
		System.out.println(getNumberOfHoles(34000056));

	}

}
