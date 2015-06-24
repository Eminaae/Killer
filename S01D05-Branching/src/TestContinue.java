
public class TestContinue {
	public static void main(String[]args){
		int broj = 0;
		while (broj < 100){
			broj ++; // mora biti ovdje, ako je u if nece doci do inkrementa
			if(broj % 3!=0){
				continue;
			}
			System.out.println(broj);
		}
	}
}
