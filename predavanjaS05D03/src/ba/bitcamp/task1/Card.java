package ba.bitcamp.task1;

/**
 * his class represents a Card from a standerd deck The values go from 1 - 13 11
 * - Jack 12 - Queen 13 - King Suits go from 0 - 4 0 - Heart 1 - Diamonds 2 -
 * Clubs 3 _ Spades 4 - Joker
 * 
 * @author kristina.pupavac
 *
 */
public class Card {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 13;

	private static final int MIN_SUIT = 0;
	private static final int MAX_SUIT = 4;

	public static final int HEART = 0;
	public static final int DIAMOND = 1;
	public static final int CLUB = 2;
	public static final int SPADE = 3;
	public static final int JOKER = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	private int value;
	private int suit;
	private boolean isJoker = false;

	public Card() {
		this.suit = JOKER;
		this.value = 0;
		isJoker = true;
	}

	/**
	 * Default constructor
	 * 
	 * @param value
	 * @param suit
	 */
	public Card(int value, int suit) {
		if (value < MIN_VALUE || value > MAX_VALUE) {
			throw new IllegalArgumentException("Value must be in range 1 to 13");
		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit must be in range 0 to 4");
		}
		this.value = value;
		this.suit = suit;
		if (suit == MAX_SUIT) {
			this.isJoker = true;

		}
	}
	/**
	 * 
	 * @return
	 */
	public int getValue() {
		return value;
	}
	/**
	 * 
	 * @return
	 */
	public int getSuit() {
		return suit;
	}
	/**
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		if (isJoker == false) {
			throw new UnsupportedOperationException(
					"Can't change the value of a non Jocker");
		}
		this.value = value;
	}
	/**
	 * 
	 */
	public void setSuit(int suit) {
		if (isJoker == false) {
			throw new UnsupportedOperationException(
					"Can't change the value of a non Jocker");
		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit must be in range 0 to 4");
		}
		this.suit = suit;
	}
	/**
	 * 
	 * @return
	 */
	public String getValueString() {
		// because cards between 1 and 10 are just numbers
		if (value == 1 || value > 10) {
			switch (value) {
			case ACE:
				return "Ace";
			case JACK:
				return "Jack";
			case QUEEN:
				return "Queen";
			case KING:
				return "King";
			default:
				return "";
			}
		} else {
			return Integer.toString(value);
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getSuitString() {
		switch (suit) {
		case HEART:
			return "Heart";
		case DIAMOND:
			return "Diamond";
		case CLUB:
			return "Club";
		case SPADE:
			return "Spade";
		default:
			return "Joker";
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getCard() {
		return getValueString() + " " + getSuitString();
	}
	/**
	 * 
	 */
	public String toString () {
		return getCard();
	}

}
