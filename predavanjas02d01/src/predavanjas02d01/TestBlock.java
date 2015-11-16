package predavanjas02d01;

public class TestBlock {

	public static void main(String[] args) {
		int mainInt = 10;
		if (mainInt > 0){
			mainInt -= 2;
			int ifInt = 2;
			System.out.println("ifInt from if:" + ifInt);
			System.out.println("mainInt from if:" + mainInt);
		}
		System.out.println("mainInt from if:" + mainInt);
		int ifInt = 3;
		System.out.println("mainInt from main:" + ifInt);

	}

}
