
public class ReadWrite {

	public static void main(String[] args) {
		
		TextIO.readFile("src/numbers.txt");
		
		int num1 = TextIO.getInt();
		int num2 = TextIO.getInt();
		int num3 = TextIO.getInt();
		int num4 = TextIO.getInt();
		
		int sum = num1 + num2 + num3 + num4;
		
		
		TextIO.writeUserSelectedFile();
		TextIO.putln("Sum is: " + sum);
	
	
	}

}
