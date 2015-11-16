package ba.bitcamp.task3;

/*
 * Napisati klasu koja opisuje jedan printer. Printer ima sljedece atribute:
 * Ime printera
 * Kolicina papira u printeru
 * Kolicina tinte u printeru
 * Ukupno isprintano stranica
 Printer ima sljedeće konstruktore:
 * Prazni konstruktor koji inicijalizira ime na „DefaultPrinter“, a kolicinu papira i tinte na 0
 * Konstruktor koji inicijalizira ime na dati parametar, a kolicinu papira i tinte na 0
 * Oba konstruktora inicijaliziraju ukupno isprintano stranica na 0 Printer ima sljedece metode:
 * Metoda koja vraca da li ima tinte (true/false)
 * Metoda koja vraca da li ima papira (true/false)
 * Metoda koja vraca koliko je ukupno isprintano stranica od tog printera
 * Metoda koja dodaje papira u printer (void metoda)
 * Uzeti u obzir da se ne moze imati vise od 100 papira u printeru 
 * Metoda koja napuni tintu na max. (void metoda)
 * Maksimalno tinte je 100
 * Metoda koja „printa“ stranice papira (void metoda)
 * Metoda prima int parametar koji predstavlja koliko stranica isprintati 
 * Za svaku isprintanu stranicu oduzeti jedan papir iz printera
 * Za svaku isprintanu stranicu oduzeti tri iz atributa tinta
 * Ukoliko nema papira ili ako nema tinte onda ne treba printati
 Pored toga Printer klasa sadrzi sljedece:
 * toString metodu koja printa ime printera i trenutno stanje
 * Stanje moze biti „Ready“, „No ink“, „No paper“, „No ink nor paper“
 * static varijablu koja bilježi koliko ukupno stranica je isprintano
 * Napisati i metodu koja vraca vrijednost te varijable
 * Napisati malu demonstraciju rada vaše klase u main metodi.
 */

/**
 * 
 * Class priter
 * @author kristina.pupavac
 *
 */
public class Printer {
	private String name;
	private int ink;
	private int paper;
	private int printedPage;
	public static int totalPagePrinted;

	/**
	 * defalut constructor
	 */
	public Printer() {
		this.name = "DefaultPrinter";
		this.printedPage = 0;
		this.ink = 0;
		this.paper = 0;
	}

	/**
	 * Constructor with priter name
	 * @param name
	 */
	public Printer(String name) {
		this.name = name;
		this.ink = 0;
		this.printedPage = 0;
		this.paper = 0;
	}

	/**
	 * has ink in priter
	 * @return true ofr false
	 */
	public boolean hasInk() {
		if (ink == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Has paper in priter
	 * @return true of false
	 */
	public boolean hasPaper() {
		if (paper == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Return number of printed pages by one printer
	 * 
	 * @return
	 */
	public int numberOfPages() {
		return printedPage;
	}

	/**
	 * adding paper in printer
	 * 
	 * @param newPaper
	 */
	public void addpaper(int newPaper) {
		this.paper = paper + newPaper;
		if (this.paper >= 100) {
			this.paper = 100;
		}
	}

	/**
	 * adding ink in printer
	 * 
	 * @param newInk
	 */
	public void addInk(int newInk) {
		this.ink = ink + newInk;
		if (ink >= 100) {
			this.ink = 100;
		}
	}

	/**
	 * Pritnig page and counting number of prited page
	 * 
	 * @param pageForPrint
	 */
	public void print(int pageForPrint) {
		for (int i = 0; i < pageForPrint; i++) {
			this.paper = paper - 1;
			for (int j = 0; j < pageForPrint; j++) {
				this.ink = ink - 3;
			}
			printedPage++;
			totalPagePrinted++;
		}
	}

	/**
	 * printing string
	 */
	public String toString() {
		String s = "Printer name: " + name + ". Status: ";
		if (ink != 0 && paper != 0) {
			s = s + " Ready!";
		} else if (ink == 0 && paper != 0) {
			s = s + " No ink!";
		} else if (ink != 0 && paper == 0) {
			s = s + " No paper!";
		} else if (ink == 0 && paper == 0) {
			s = s + " No ink no paper!";
		}
		return s;
	}

	/**
	 * Total number of printed page by all priters
	 * 
	 * @return
	 */
	public static int printedPageSum() {
		return totalPagePrinted;
	}

}
