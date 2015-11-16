package ba.bitcamp.sport;

/**
 * This class represents sport
 * 
 * @author kristina.pupavac
 *
 */
public class Sport {
	private boolean IsColective;
	private int numberOfPlayers;

	/**
	 * @return the isColective
	 */
	public boolean isIsColective() {
		return IsColective;
	}

	/**
	 * @param isColective
	 *            the isColective to set
	 */
	public void setIsColective(boolean isColective) {
		IsColective = isColective;
	}

	/**
	 * @return the numberOfPlayers
	 */
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	/**
	 * @param numberOfPlayers
	 *            the numberOfPlayers to set
	 */
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

}
