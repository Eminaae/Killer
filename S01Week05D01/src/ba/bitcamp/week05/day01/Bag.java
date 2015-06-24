package ba.bitcamp.week05.day01;

public class Bag { // klasa koja pretstavlja jedan kofer.Sta on sadryi_
	public Integer maxCapacity;
	public Integer currentCapacity ;

	// metoda koja vraca max cap je getter metoda
	/*
	 * nije static jer su max i current capacity ograniceni samo za jedan
	 * objekat parametara nema jer samo vraca maxC
	 */
	
	//konstruktor koji prima SAMO maxCap

	public void add(int capacity) {
		if (currentCapacity + capacity <= maxCapacity) {
			currentCapacity += capacity;
		}
	}

	public Bag(Integer maxCapacity, Integer currentCapacity) {
		super();
		this.maxCapacity = maxCapacity;
		this.currentCapacity = 0;
	}	

	public void substract(int capacity) {
		if (currentCapacity - capacity >= 0) {
			currentCapacity -= capacity;
		}
	}
	
	/**
	 * Vraca max cap, varijabla koja nije vidljiva
	 * 
	 * @param maxCapacity
	 * @return
	 */

	public int getMaxCapacity() {
		return maxCapacity;

	}

	public int getCurrentCapacity(Integer currentCapacity) {
		return currentCapacity;
	}

	public int getFreeSpace() {
		return maxCapacity - currentCapacity;
	}

	
}
