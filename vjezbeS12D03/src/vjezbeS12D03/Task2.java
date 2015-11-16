package vjezbeS12D03;

public class Task2 {
	public static int counter = 0;

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		int[] array = new int [10_000_000];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)((Math.random() * 100) + 1); 
		}
		
		System.out.println("NUmber n i array: " + nNumbers(array, 100));
		System.out.println(System.currentTimeMillis() - t + " ms");
	}
	
	public static Integer nNumbers(int[] array, int n) {
		
		for (int j = 0; j < array.length; j++) {
			if (array[j]==n) {
				counter++;
			}
		}
		return counter;
	}

}
