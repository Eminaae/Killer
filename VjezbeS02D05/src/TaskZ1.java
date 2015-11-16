
public class TaskZ1 {
	
		public static int getSum (int num1, int num2, int num3) {
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			
			for (int i = 1; i <= num1; i++) {
				sum1 = sum1 + i;		
			}
			for (int j = 1; j <= num2; j++) {		
				sum2 = sum2 + j;
			}
			for (int k = 1; k<= num3; k++) {
				sum3 = sum3 + k;
			}
			int sum = sum1 + sum2 + sum3;
			return sum;
		}
		public static void main(String[] args) {
			System.out.println(getSum(3, 4, 6));

	}

}
