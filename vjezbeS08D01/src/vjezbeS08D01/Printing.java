package vjezbeS08D01;

public class Printing {

	public static void main(String[] args) {
		char[] c = new char[] {'A', 'g', 'm', 'I', 'c', 'R'};
		
		for (char element : c) {
			if (Character.isUpperCase(element)) {
				System.out.print(element);
			}
		}

	}

}
