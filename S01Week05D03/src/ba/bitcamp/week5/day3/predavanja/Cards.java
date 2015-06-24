package ba.bitcamp.week5.day3.predavanja;
/**
 * Class represents a Card from a standard deck
 * The values go from 1 to 13
 * 11 - Jack
 * 12 - Queen
 * 13 - King
 * Suits go from 0-4
 * 0 - Hearth
 * 1 - Diamonds
 * 2 - Clubs
 * 3 - Spades
 * 4 - Joker
 * @author emina.arapcic
 *
 */
public class Cards {
	
	/*We are making variables that will represent suits
	 * 
	 */
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 13;
	private static final int MIN_SUIT = 0;
	private static final int MAX_SUIT = 4;
	public static final int HEART = 0;
	public static final int DIAMONDS = 1;
	public static final int CLUBS = 2;
	public static final int SPADES = 3;
	public static final int JOCKER = 4;
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	//final ... value can not be changed, now that is going to be constant
	
	private int value; //Each card has one value
	private int suit;
	private boolean isJoker = false;
	/**
	 * Empty constructor has to make Jocker
	 * @param value
	 * @param suit
	 */
	public Cards(){
		this.suit = JOCKER;
		this.value = 0;
		isJoker = true;
	}
	
	public Cards (int value, int suit)throws IllegalArgumentException{
		if(value < MIN_VALUE || value > MAX_VALUE){
			throw new IllegalArgumentException("Value must be in range 1 to 13");
		}
		if(suit < MIN_SUIT || suit > MAX_SUIT){
			throw new IllegalArgumentException("Suit must be in range 0 to 4");
		}
		this.value = value;
		this.suit = suit;
		if(suit == MAX_SUIT){
			this.isJoker = true;
	}
	}
	
	public int getValue(){
		return value;	
	}
	
	public int getSuit(){
		return suit;
	}
	
	public void setValue(int value){
		if(isJoker == false){
			throw new UnsupportedOperationException("Cant change the value of a non Joker");
		}
		this.value = value;
	}
	
	public void setSuit(int suit){
		if(isJoker == false){
			throw new UnsupportedOperationException("Cant change the value of a non Joker");
		}if(suit < MIN_SUIT || suit > MAX_SUIT){
			throw new IllegalArgumentException("Suit must be in range 0 to 4");
		}
		this.suit =suit;
	}
	
	public String getValueString(){	
		if(value == 1 || value > 10 ){
			switch(value){
			case 1:
				return "Ace";
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			default: 
				return "";
			}	
	}else{
		return Integer.toString(value);
	}
	
}
	public String getSuitString(){
		switch(suit){
		case HEART:
			return "Heart";
		case DIAMONDS:
			return "Diamond";
		case CLUBS:
			return "Clubs";
		case SPADES:
			return "Spade";
			default:
				return "Joker";
		}
	}
}
	


