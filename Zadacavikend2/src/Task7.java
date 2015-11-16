import java.util.Scanner;


public class Task7 {

	public static void main(String[] args) {
		System.out.println("Input N: ");
		Scanner input = new Scanner (System.in);
		int N = input.nextInt();
		
		System.out.println("Input K: ");
		int K = input.nextInt();
		input.close();
		
		int counter = 0;
		int reducedN = N;
		while (reducedN > K) {
			reducedN = N;
			while (reducedN % 2 ==0) {
				reducedN /= 2;
			}
			if (reducedN > K) {
				N++;
				counter++;
			}
		}
//		int numN = N;
//		int countainers = 0;
//		boolean canFit = true;
//		int countainers = 0;
//		while (numN > K) {
//			if(!canFit){
//				numN = N + countainers;
//				canFit = true;
//		}
//			if (numN % 2 == 0) {
//				numN /= 2;
//			} else {
//				canFit = false;
//			    countainers++;		
//			}
//		}
		System.out.println("Number of added countainers is: ");
//		System.out.println(countainers);
		System.out.println(counter);
	}
}
