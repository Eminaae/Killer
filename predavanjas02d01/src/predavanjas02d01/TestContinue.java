package predavanjas02d01;

public class TestContinue {

	public static void main(String[] args) {
		int broj = 0;
		while (broj++ < 100){
		
			if (broj % 3 != 0){
				continue;
			}
			System.out.println(broj);
		
		}
	}

}
