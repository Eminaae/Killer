package ba.bitcamp.week5.day3.predavanja;

import java.util.Random;

public class Deck {
	private Cards[] cards;
	private int numberOfDealtCards = 0; //making new variable to count cards
	
	public Deck(boolean includeJokers){
		if(includeJokers ==true){
			this.cards = new Cards[54];
			cards[53] = new Cards();
			cards[52] = new Cards();
		}else {
			this.cards = new Cards[52];
		}
			generateCards();
		}
	
	private void generateCards(){
		int counter = 0;
		for(int j = Cards.ACE; j<= Cards.KING; j++){
			cards[++counter] = new Cards(j, Cards.ACE);
			cards[counter++] = new Cards(j, Cards.CLUBS);
			cards[counter++] = new Cards(j, Cards.SPADES);
			cards[counter++] = new Cards(j, Cards.DIAMONDS);
		}
	}
	
	public void shuffleCards(){
		Random rand = new Random();
		for (int i = 0; i < cards.length; i++){
			int first = rand.nextInt(cards.length);
			int second = rand.nextInt(cards.length);
			Cards temp = cards [first];
			cards[first] = cards [second];
			cards[second] = temp;
		}
	}
	
	public int remainingCards(){
		return cards.length - numberOfDealtCards;
	}
	
	public boolean isEmpty(){
		return remainingCards() == 0;
	}
	
	/**
	 * returns card
	 * @return
	 */
	public Cards dealCards(){
		if(isEmpty())
			throw new UnsupportedOperationException("Deck is empty");
			return cards[numberOfDealtCards++];
		}	
}
	

	


