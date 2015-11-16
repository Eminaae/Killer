
public class Bag {
	private String brand;
	private String color;
	private String size;
	private boolean full;
	private int serialNumber;
	
	public Bag (String b, String c, String s, boolean f, int sn) {
		brand = b;
		color = c;
		size = s;
		full = f;
		serialNumber = sn;
		
	}
	public String toString() {
		String s = "";
		s = s + "Brand: " + brand + "\n";
		s = s + "Color: " + color + "\n";
		s = s + "size: " + size + "\n";
		s = s + "Is full: " + full + "\n";
		
		return s;
	}
}
