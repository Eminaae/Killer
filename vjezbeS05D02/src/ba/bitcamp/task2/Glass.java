package ba.bitcamp.task2;

/*
 * Napisati klasu koja opisuje casu. Casa prima samo jednu vrstu tecnosti. Dati objekat opisuju tri atributa, vrsta tecnosti, kolicinu tecnosti i maksimalnu kolicinu 
 * tenosti.
 * Napisati konstruktor koji inicijalizira kolicinu na 0, vrstu na null i max. kolicinu na datu vrijednost
 * Napisati metodu getTypeOfLiquid() koja vraca tip tecnosti koji se nalazi u casi 
 * Napisati metodu getMaxCapacity() koja vraca maksimalni kapacitet case 
 * Napisati metodu getCurrentCapacity() koja vraca trenutni kapacitet  case 
 * Napisati metodu addLiquid(String, int) koja dodaje neku kolicinu nekog tipa tecnosti u  casu 
 * Ukoliko casa sadrzi  tecnost koja nije kao data onda nista ne raditi
 * Ukoliko casa sadrzi tecnost koja je i data onda povecati za datu kolicinu
 * Svaki visak tecnosti se „prelije“ i trenutni kapacitet bude isti kao i maksimalni
 * Napisati metodu emptyGlass() koja „prospe“ svu tecnost iz case
 * Napisati javadoc za sve metode
 */
public class Glass {
	private String liquide;
	private int quantity;
	private int maxQuantity;
	/**
	 * set liquide name and quantity
	 * @param liquide name
	 * @param quantity 
	 */
	public void setGlass(String liquide, int quantity) {
		this.liquide = liquide;
		this.quantity = quantity;

	}
	/**
	 * Set glass liquide to null, quantity to 0 anda max quantity t max quantity
	 * @param maxQuantity
	 */
	public Glass(int maxQuantity) {
		this.liquide = null;
		this.quantity = 0;
		this.maxQuantity = maxQuantity;
	}

	/**
	 * Return liquide type
	 * @return liguise type
	 */
	public String getTypeOfLiquid() {
		return liquide;
	}

	/**
	 * Return max capacity
	 * @return max capacity
	 */
	public int getMaxCapacity() {
		return maxQuantity;
	}

	/**
	 * Return current capacity
	 * @return current capacity
	 */
	public int getCurrentCapacity() {
		return quantity;
	}

	/**
	 * adding new liqude  if isn't same liqude print not the smae else add if glas is full oversize
	 * @param newLiquide liquide name
	 * @param addQuantity quantity
	 */
	public void addLiquid(String newLiquide, int addQuantity) {
		if (liquide.equals(newLiquide)) {
			this.quantity = quantity + addQuantity;
			if (this.quantity > this.maxQuantity) {
				this.quantity = maxQuantity;
			}
		} else {
			System.out.println("Nisu iste tecnosti!");
		}
	}

	/**
	 * Set quantity = 0
	 */
	public void emptyGlass() {
		quantity = 0;
	}

	/**
	 * printing string
	 */
	public String toString() {
		String output = "Tecnost:  " + liquide + " kolicina: " + quantity
				+ " maksimalan kolicina: " + maxQuantity;
		return output;
	}

}
