package ba.bitcamp.kristina.test;

/**
 * 
 * @author kristina.pupavac
 * Class Artifacts extends class Showpiece and contains artefacst origin and era
 */
public class Artifacts extends Showpiece {
	//attributes
	private String origin;
	Era era;

	public enum Era {
		CLASSICAL, MIDDLE_AGES, MODERN_TIME
	};
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param description
	 * @param origin
	 * @param era
	 */
	public Artifacts(int id, String name, String description, String origin,
			Era era) {
		super(id, name, description);
		this.origin = origin;
		this.era = era;
	}

	/**
	 * @return the era
	 */
	public Era getEra() {
		return era;
	}

	/**
	 * @param era
	 *            the era to set
	 */
	public void setEra(Era era) {
		this.era = era;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artifacts other = (Artifacts) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Origin: " + origin + ", Era: " + era;
	}
}
