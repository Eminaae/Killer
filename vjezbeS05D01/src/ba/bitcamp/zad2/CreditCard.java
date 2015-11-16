package ba.bitcamp.zad2;

/*
 * Napisati klasu koja predstavlja jednu kreditnu karticu. Kartica ima sljedece stvari:
 * Atribut koji predstavlja broj kartice
 * Atribut koji predstavlja banku
 * Atribut koji predstavlja mjesec kada istice kartica
 * Atribut koji predstavlja godinu kada istice kartica
 * Metoda koja dodaje odredjenu sumu novca na karticu
 * Metoda koja oduzima odredjenu sumu novca sa kartice (moze ici ispod nule)
 * Metoda koja vracca stanje na racunu (sumu novca)
 * CreditCard c1 = new CreditCard(); // Napravi karticu sa 0 KM 
 * c1.addMoney(7900); // Dodati 7900 KM na karticu 
 * System.out.println(c1.getCardBalance()); // 
 * Isprinta 7900 KM w.addCard(c1); // Dodaj karticu u novčanik
 */
public class CreditCard {
	private int cardNumber;
	private String bank;
	private String expiriesMonth;
	private int expiriesYear;
	private int account;

	public CreditCard(int cardNumber, String bank, String expiriesMonth,
			int expiriesYear) {
		this.cardNumber = cardNumber;
		this.bank = bank;
		this.expiriesMonth = expiriesMonth;
		this.expiriesYear = expiriesYear;
		this.account = 0;
	}

	/**
	 * 
	 * @param money
	 */
	public void addMoney(int money) {
		account = account + money;
	}

	/**
	 * 
	 * @param money
	 */
	public void subtractionMoney(int money) {
		account = account - money;
	}

	/**
	 * 
	 * @return
	 */
	public int getCardBalance() {
		return account;
	}
	

}
