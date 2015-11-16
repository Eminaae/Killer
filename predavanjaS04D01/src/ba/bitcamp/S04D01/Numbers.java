package ba.bitcamp.S04D01;



public class Numbers {

	public static void main(String[] args) {
		int sum = 0; 
		for (String arg : args) {
			int number = Integer.parseInt(arg);
			sum += number;
			
		}
		System.out.printf("Suma je: %d\n", sum);
		
//		int sum = 0; 
//		for (String number : args) {
//			sum = sum + Integer.parseInt(number);
//		}
//		System.out.printf("Suma je: %d\n", sum);
	}


}
