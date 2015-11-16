package ba.bitcamp.task4;

public class LifeForm {
	private Boolean isAlive;

	/**
	 * @param isAlive
	 */
	public LifeForm(Boolean isAlive) {
		this.isAlive = true;
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LifeForm other = (LifeForm) obj;
		if (isAlive == null) {
			if (other.isAlive != null)
				return false;
		} else if (!isAlive.equals(other.isAlive))
			return false;
		return true;
	}

	/**
	 * 
	 */
	public String toString() {
		String s = "";
		s = "Is alive? " + isAlive;
		return s;
	}

}
