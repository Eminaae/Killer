package ba.bitcamp.week05.day01;

public class CreditCard {
	
	int number;
	String bankName;
	int expMonth;
	int expYear;
	int balance;
	CreditCard[] creditCards;
	

	public CreditCard() {
		this.number = number;
		this.bankName = bankName;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.balance = balance;
	}

	public void addMoney(int money){
		balance += money;		
	}
	
	public void getMonay(int money) {
		balance -= money;
	}
	
	public int getCardBalance (){
		return balance;
	}

}
