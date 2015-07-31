package ba.bitcamp.tasks;

import java.util.StringTokenizer;

public class PokerHand {
	private String nothingInHand;
	private String onePair;
	private String twoPairs;
	private String threeOfaKind;
	private String straight;
	private String flush;
	private String fullHouse;
	private String fourOfaKind;
	private String straightFlush;
	private String royalFlush;
	/**
	 * @param nothingInHand
	 * @param onePair
	 * @param twoPairs
	 * @param threeOfaKind
	 * @param straight
	 * @param flush
	 * @param fullHouse
	 * @param fourOfaKind
	 * @param straightFlush
	 * @param royalFlush
	 */
	public PokerHand(String nothingInHand, String onePair, String twoPairs,
			String threeOfaKind, String straight, String flush,
			String fullHouse, String fourOfaKind, String straightFlush,
			String royalFlush) {
		super();
		String line = null;
		StringTokenizer st = new StringTokenizer(line, ",");
		this.nothingInHand = st.nextToken();
		this.onePair = st.nextToken();
		this.twoPairs = st.nextToken();
		this.threeOfaKind = st.nextToken();
		this.straight = st.nextToken();
		this.flush = st.nextToken();
		this.fullHouse = st.nextToken();
		this.fourOfaKind = st.nextToken();
		this.straightFlush = st.nextToken();
		this.royalFlush = st.nextToken();
	}
	public String getFullHouse() {
		return fullHouse;
	}
	public void setFullHouse(String fullHouse) {
		this.fullHouse = fullHouse;
	}
	
	public String toString(){
		return fullHouse;
	}
	
	

}
