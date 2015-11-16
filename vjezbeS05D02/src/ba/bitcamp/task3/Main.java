package ba.bitcamp.task3;

public class Main {

	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		System.out.println(p1.toString());
		
		Printer p2 = new Printer("Stampac");
		System.out.println(p2.toString());
		
		System.out.println(p1.hasInk());
		System.out.println(p1.hasPaper());
		
		p2.addpaper(5);
		System.out.println(p2.toString());
		
		p2.addInk(10);
		System.out.println(p2.toString());
		
		p2.print(5);
		
		System.out.println(p2.toString());
		
		p2.addpaper(50);
		p2.addInk(30);
		System.out.println(p2);
		
		p2.print(4);
	
		System.out.println("Number of one printer printed page: " + p2.numberOfPages());
		
		Printer p3 = new Printer ("Stampac1");
		
		p3.addInk(20);
		p3.addpaper(20);
		
		System.out.println(p3);
		
		p3.print(5);
		
		System.out.println("Number of one printer printed page: " + p3.numberOfPages());
		
		System.out.println("Number of all printed page: " + Printer.printedPageSum());

	}

}
