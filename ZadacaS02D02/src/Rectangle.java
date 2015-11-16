
public class Rectangle {
/* Write a program that draws a rectangle on the screen, whereby the date website and b rectangle. To draw using the signs: - (minus) on the horizontal line
 * | (pipe) to erect + (plus) for the angles.
 */
	public static void main(String[] args) {
		
		int a = 3;
		int b = 6;
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (j == 0 || j == a && i != b -1) {
					System.out.print("+");
				} else {
					System.out.print("-");
			    }
				
		     }
			System.out.println("|");
	    }
		
	}
}