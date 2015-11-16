package ba.bitcamp.sport;

/**
 * This class represents ball sports
 * 
 * @author kristina.pupavac
 *
 */
public class BallSports extends Sport {
	private int ballSize;
	private int cortSize;

	/**
	 * @return the ballSize
	 */
	public int getBallSize() {
		return ballSize;
	}

	/**
	 * @param ballSize
	 *            the ballSize to set
	 */
	public void setBallSize(int ballSize) {
		this.ballSize = ballSize;
	}

	/**
	 * @return the cortSize
	 */
	public int getCortSize() {
		return cortSize;
	}

	/**
	 * @param cortSize
	 *            the cortSize to set
	 */
	public void setCortSize(int cortSize) {
		this.cortSize = cortSize;
	}

}
