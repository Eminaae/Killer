package vjezbeS04D01;

public class Task7_1 {
	public static void main(String[] args) {
		int arr[] = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
			if (arr[i] % 5 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
