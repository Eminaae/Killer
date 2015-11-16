import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		System.out.println("Input bin number: ");
		Scanner input = new Scanner (System.in);
		String bin = input.next();
		System.out.println("Input n: ");
		int n = input.nextInt();
		input.close();
		
		if (!(bin.charAt(0) == '1' && bin.length() == n)) {
			System.out.println(bin);
			System.exit(0);
		}
		
		String first = "";
		for (int i = 0; i < bin.length(); i++) {
			first += (bin.charAt(i) == '1')? "0":"1";
		}
		int base10 = 0;
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) == '1') {
				base10 += (int) Math.pow(2, first.length() - 1 - i);
			}
		}
		base10++;
		String second = "";
		while (base10 != 0) {
			if (base10 %2 == 0){
				second = "0" + second;
			} else {
				second = "1" + second;
			}
			base10 /= 2;
		}
		System.out.println(second);

	}

}
