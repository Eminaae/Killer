package ba.bitcamp.sport;

/**
 * This class represents football
 * @author kristina.pupavac
 *
 */
public class Football extends BallSports {
	private String timName;
	private String[] players;

	/**
	 * @return the timName
	 */
	public String getTimName() {
		return timName;
	}

	/**
	 * @param timName
	 *            the timName to set
	 */
	public void setTimName(String timName) {
		this.timName = timName;
	}

	/**
	 * @return the players
	 */
	public String[] getPlayers() {
		return players;
	}

	/**
	 * @param players
	 *            the players to set
	 */
	public void setPlayers(String[] players) {
		this.players = players;
	}

}
