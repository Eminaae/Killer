package predavanjaS09D01;

public class Trip {
	private Place start;

	/**
	 * @param from
	 * @param to
	 */
	public Trip(Place start) {
		super();
		this.start = start;
	}

	/**
	 * @return the start
	 */
	public Place getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Place start) {
		this.start = start;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trip from: " + start;
	}
}
