package ba.bitcamp.week05.day01;

public class Main1 {

	public static void main(String[] args) {
		
		CreditCard c1 = new CreditCard();
		CreditCard c2 = new CreditCard();
		CreditCard c3 = new CreditCard();
		
		c1.addMoney(7900);// Napravi karticu sa 0 KM c1.addMoney(7900); // Dodati 7900 KM na karticu S
		System.out.println(c1.getCardBalance()); // Isprinta 7900 KM w.addCard(c1); // Dodaj karticu u novčanik
		
		CreditCard [] creditCards = new CreditCard[]{c1, c2, c3};
		
		Wallet w = new Wallet(2);
		System.out.println(w.getWalletBalance());
	}

}
