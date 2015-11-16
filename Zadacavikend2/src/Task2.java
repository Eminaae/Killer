/*
 * Java is known to each bracket should have its own bracket. Your task is to make sure you have all the 
 * brackets closed properly. One bracket fits exactly a one closed bracket. In addition, the bracket can not be 
 * closed if there is no any which will close. With the console receiving a String, which is a series of 
 * brackets. Determine whether all brackets open and closed properly. If so, print true, otherwise false
 */
public class Task2 {

	public static void main(String[] args) {
		
	
		//Initialization of variables
	    String bracketSeries = ("{}}{{");
		int bracketLength = bracketSeries.length();
		int openBrackets = 0;
		
		for (int i = 0; i < bracketLength; i++){
			if (bracketSeries.charAt(i) == '{'){
				openBrackets++;
			} else {
				openBrackets--;
			}
				if (openBrackets < 0) {
					System.out.println(false);
					System.exit(0);
				}
		}
		if (openBrackets == 0){
			System.out.println(true);
		} else {
			System.out.println(false);
		}	
	}
}