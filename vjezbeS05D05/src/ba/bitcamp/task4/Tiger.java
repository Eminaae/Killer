package ba.bitcamp.task4;

public class Tiger extends Animal {
	private int speed;
	private int state;
	public static final int INACTION = 0;
	public static final int HUNT = 1;
	public static final int EATING = 2;

	/**
	 * 
	 * @param isAlive
	 * @param animalSize
	 * @param favoriteFood
	 */
	public Tiger(int animalSize, int speed) {
		super(true, animalSize, Animal.FOOD_ANIMALS);
		this.speed = speed;
		this.state = Tiger.HUNT;
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
		Tiger other = (Tiger) obj;
		if (speed != other.speed)
			return false;
		return true;
	}

	/**
	 * 
	 */
	public String toString() {
		String s = " ";
		s += super.toString();
		s = s + "Speed: " + speed + " ";
		if (state == Tiger.INACTION) {
			s = s + " State: inaction.";
		} else if (state == Tiger.EATING) {
			s = s + " State: eating.";
		} else if (state == Tiger.HUNT) {
			s= s + "State: hunt";
		}
		return s;
	}

}
