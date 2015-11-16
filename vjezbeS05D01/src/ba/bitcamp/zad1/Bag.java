package ba.bitcamp.zad1;
/*Napisati klasu koja predstavlja jedan kofer. Kofer sadrzi sljedecce stvari:
 * Atribut kapacitet; koliko u kofer može ukupno stati
 * Atribut trenutni kapacitet; koliko se trenutno nalazi u koferu
 * Metoda koja vraca maksimalni kapacitet
 * Metoda koja vraca trenutni kapacitet
 * Metoda koja vraca koliko je ostalo još mjesta
 * Metoda koja dodaje stvari u kofer
 * Metoda koja oduzima stvari iz kofera
 * Konstruktor koji prima maksimalni kapacitet
 * Primjer
 * Bag b = new Bag(40); // Napravi torbu sa kapacitetom 40 
 * System.out.println(b.getMaxCapacity()); // Isprinta 40 b.add(20);
 * b.add(30); // Neće dodati jer je max. 40 
 * System.out.println(g.getFreeSpace()); // Isprinta 20 b.add(20);
 * System.out.println(g.getCurrentCapacity()); // Isprinta 40
 * 
 */
public class Bag {
	private int capacity;
	private int currentCapacity;
	/**
	 * 
	 * @param capacity
	 */
	Bag(int capacity){
		this.capacity = capacity;
		this.currentCapacity = 0;
	}
	/**
	 * 
	 * @return
	 */
	public int getMaxcapacity(){
		return capacity;
	}
	/**
	 * 
	 * @return
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}
	/**
	 * 
	 * @return
	 */
	public int getFreeSpace() {
		return capacity - currentCapacity;
	}
	/**
	 * 
	 * @param num
	 */
	public void add (int num) {
		try {
		if (num + currentCapacity <= capacity){
			currentCapacity = currentCapacity + num;
		} 
		}catch (ArithmeticException ex) {
			System.out.println("To much things!");
		}
			
		}
	/**
	 * 
	 * @param num
	 */
	public void subtraction (int num) {
		 currentCapacity = currentCapacity - num;
	}

}
