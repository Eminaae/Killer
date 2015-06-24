//Program koji sadrži pozitivni cijeli broj 𝑛. Ispisati na konzolu 𝑛!.
public class Task04 {

	public static void main(String[] args) {
		int num =4;
		int i=1;
		int fact=1;
		while (i<num){
			fact=fact*i;
			i++;	
		}
	System.out.println(fact);
	}
}
