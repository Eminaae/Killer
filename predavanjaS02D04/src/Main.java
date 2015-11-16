
public class Main {

	public static void main(String[] args) {
		int counter1 = 0;
		int counter2 = 0;
	    int counter3 = 0;
	    int counter4 = 0;
	    int counter5 = 0;
	    
	    int counter = 0;
		do {
			 counter1 = 0;
			 counter2 = 0;
		     counter3 = 0;
		     counter4 = 0;
		     counter5 = 0;
		    
			for (double i = 0; i < 1000; i++) {
				double d = (int)(Math.random() * 5 + 1);
				if (d == 1){
					counter1++;
				} else if (d == 2){
					counter2++;
				} else if (d == 3){
					counter3++;
				} else if (d == 4){
					counter4++;
				} else {
					counter5++;
				}
			}
		} while (counter1 != counter2 || counter2 != counter3 || counter3 != counter4 || counter4 != counter5);
		
			System.out.println("Num of 1: " + counter1);
			System.out.println("Num of 2: " + counter2);
			System.out.println("Num of 3: " + counter3);
			System.out.println("Num of 4: " + counter4);
			System.out.println("Num of 5: " + counter5);
	}

}
