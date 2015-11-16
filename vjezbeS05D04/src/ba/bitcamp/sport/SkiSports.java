package ba.bitcamp.sport;

/**
 * This class represents ski sports
 * 
 * @author kristina.pupavac
 *
 */
public class SkiSports extends Sport {
	private int trimSize;
	private boolean hasStiks;

	/**
	 * @return the trimSize
	 */
	public int getTrimSize() {
		return trimSize;
	}

	/**
	 * @param trimSize
	 *            the trimSize to set
	 */
	public void setTrimSize(int trimSize) {
		this.trimSize = trimSize;
	}

	/**
	 * @return the hasStiks
	 */
	public boolean isHasStiks() {
		return hasStiks;
	}

	/**
	 * @param hasStiks
	 *            the hasStiks to set
	 */
	public void setHasStiks(boolean hasStiks) {
		this.hasStiks = hasStiks;
	}

}
