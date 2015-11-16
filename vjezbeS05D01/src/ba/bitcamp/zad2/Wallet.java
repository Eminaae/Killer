package ba.bitcamp.zad2;

/*
 * Napisati klasu koja predstavlja jedan novcanik. Novcanik ima sljedee stvari:
 * Atribut koji predstavlja koliko novca ima u novcaniku
 * Atribut koji predstavlja niz kartica
 * Konstruktor koji odredjuje koliko ce maksimalno kartica biti
 * Metoda koja dodaje odredjenu sumu novca u novcanik
 * Metoda koja oduzima odredjenu sumu novca u novcanik (ne moze ici ispod nule)
 * Metoda koja dodaje karticu
 */
public class Wallet {
	private int currentMoney;
	private CreditCard[] cardArray;

	public Wallet(int max) {
		this.currentMoney = 0;
		this.cardArray = new CreditCard[max];
	}

	/**
	 * 
	 * @param money
	 */
	public void addWallet(int money) {
		currentMoney = currentMoney + money;
	}

	/**
	 * 
	 * @param money
	 */
	public void subtractionWallet(int money) {
		currentMoney = currentMoney - money;
	}
	/**
	 * 
	 * @param card
	 */
	public void addCard(CreditCard card) {
		for (int i = 0; i < cardArray.length; i++) {
			if (cardArray[i] == null) {
				cardArray[i] = card;
			} else {
				System.out.println("Wallet is full with cards.");
			}
		}
	}
 /*  public void getWalletBalance() {
	   for (int i = 0; i < w.getNumberOfCards(); i++) { 
		   System.out.println(w.getCard(i).getCardBalance());
	   }
	   
   }*/

}
