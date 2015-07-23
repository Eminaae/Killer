package ba.bitcamp.week10.day4.exercises;

public class Artifact{
	private String origin; 
	enum period {CLASSICAL, MIDDLE_AGE, MODERN_AGE}
	
	/**
	 * @param origin
	 */
	public Artifact(String origin) {
		super();
		this.origin = origin;
	}

	
	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	/**
	 * Equals method implementation
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Artifact)) {
			return false;
		}
		Artifact other = (Artifact) obj;
		if (origin == null) {
			if (other.origin != null) {
				return false;
			}
		} else if (!origin.equals(other.origin)) {
			return false;
		}
		return true;
	}

	/**
	 * To String method implementation
	 */
	@Override
	public String toString() {
		return origin ;
	}

}
