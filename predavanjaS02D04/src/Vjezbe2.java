
public class Vjezbe2 {

	public static void main(String[] args) {
		
		double number;
		double product;
		double counter = 0;
		
		for (int i = 0; i <= counter; i++){
			
			double a = (int)(Math.random() * 9 + 1);
			double b = (int)(Math.random() * 9 + 1);
			TextIO.putln("Multiply the following numbers: " + a + " * " + b + " =");
			TextIO.put("Input result: ");
			number = TextIO.getDouble( );
				
				product = a * b;

				if (product == number) {
					counter++;
					TextIO.putln("Number of points is: " + counter);
					TextIO.writeUserSelectedFile();
	
				} else
					counter--;
					TextIO.putln("Number of points is: " + counter);
		}	
		
	}

}
