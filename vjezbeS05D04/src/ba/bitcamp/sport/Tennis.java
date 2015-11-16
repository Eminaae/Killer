package ba.bitcamp.sport;

/**
 * 
 * @author kristina.pupavac
 *
 */
public class Tennis extends BallSports {
	public boolean isATP;
	public boolean isMasters;

	/**
	 * @return the isATP
	 */
	public boolean isATP() {
		return isATP;
	}

	/**
	 * @param isATP
	 *            the isATP to set
	 */
	public void setATP(boolean isATP) {
		this.isATP = isATP;
	}

	/**
	 * @return the isMasters
	 */
	public boolean isMasters() {
		return isMasters;
	}

	/**
	 * @param isMasters
	 *            the isMasters to set
	 */
	public void setMasters(boolean isMasters) {
		this.isMasters = isMasters;
	}

}
