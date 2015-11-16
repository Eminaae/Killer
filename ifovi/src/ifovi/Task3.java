package ifovi;

//Program koji odredi koji je najveći broj od data tri broja.

public class Task3 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		int num3 = 3;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Ovo je najveci broj. " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Ovo je najveci broj. " + num2);
		} else {
			System.out.println("Ovo je najveci broj. " + num3);
		}

	}

}
