package ba.bitcamp.task4;

public class Plant extends LifeForm {
	private Boolean isToxic;
	private int state;

	public static final int LITTLE_TOXIC = 0;
	public static final int MORE_TOXIC = 1;
	public static final int THE_MOST_TOXIC = 2;

	public Plant(Boolean isAlive, Boolean isToxic) {
		super(isAlive);
		this.isToxic = isToxic;
		this.state = Plant.THE_MOST_TOXIC;
	}

	/* (non-Javadoc)
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
		Plant other = (Plant) obj;
		if (isToxic == null) {
			if (other.isToxic != null)
				return false;
		} else if (!isToxic.equals(other.isToxic))
			return false;
		if (state != other.state)
			return false;
		return true;
	}
	
	public String toString () {
		String s = "";
		s = s + super.toString();
		s = "Is toxic? " + isToxic + " ";
		if (state == Plant.LITTLE_TOXIC) {
			s = s + " Little toxic."; 
		} else if (state == Plant.MORE_TOXIC) {
			s = s + " More toxic.";
		} else if (state == Plant.THE_MOST_TOXIC) {
			s = s+ " The most toxic.";
		}
		return s;
	}
	

}
