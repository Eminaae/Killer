
class Drink {
	String name;
	boolean isSoda;
	int expirationYear;
	String color;
	
	public String toString() {
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "isSoda: " + isSoda + "\n";
		s = s + "Expiration Year: " + expirationYear + "\n";
		s = s + "Color: " + color + "\n";
		
		return s;
		
	}

}
