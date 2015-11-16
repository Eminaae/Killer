package predavanjaS03D01;

public class SwitchStatment {

	public static void main(String[] args) {
		
		int a = 1;
		
		switch (a) {
		
		case 1:
			a += 2;
			Math.random();
			System.out.println("One");
			System.out.println("a je jedan");
			break;
		case 2:
			System.out.println("Two");
		case 3:
			System.out.println("Three");
		default: 
			System.out.println("Default");
		}

	}

}
