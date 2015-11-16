package ba.bitcamp.zad2;

public class Main {

	public static void main(String[] args) {
		
		Wallet w = new Wallet(2);
	
		CreditCard c1 = new CreditCard(1234, "Banka", "jun", 2016);
		c1.addMoney(7900);
		System.out.println(c1.getCardBalance()); 
		w.addCard(c1);
		CreditCard c2 = new CreditCard(345, "Banka1", "januar", 2023);
		w.addCard(c2);
		CreditCard c3 = new CreditCard(3434, "Bank3", "maj", 2034);
		w.addCard(c3);
		
	
	}

}
