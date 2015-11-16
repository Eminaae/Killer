package ba.bitcamp.stringbulider;

public class StringBuilderCamp {
	
	private char[] array;
	
	public StringBuilderCamp () {
		array = new char[0];
	}
	
	public void append (Object o) {
		String s = o.toString();
		char[] tempArray = new char [array.length + s.length()];
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		for (int i = 0; i < s.length(); i++) {
			tempArray[i + array.length] = s.charAt(i);
		}
		array = tempArray;
	}
	
	public void prepend (Object o) {
		String s = o.toString();
		char[] tempArray = new char [array.length + s.length()];
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		for (int i = 0; i < s.length(); i++) {
			tempArray[i + array.length] = s.charAt(i);
		}
		array = tempArray;
	}
	
	public String toString () {
		String s = "";
		for (int i = 0; i < array.length; i++) {
			s = s + array[i];
			
		}
		return s;
		
	}
	

}
