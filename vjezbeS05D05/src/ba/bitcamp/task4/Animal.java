package ba.bitcamp.task4;

public class Animal extends LifeForm {
	private int animalSize;
	private int foodType;
	
	public static final int FOOD_ANIMALS = 0;
	public static final int FOOD_PLANTS = 1;

	/**
	 * 
	 * @param isAlive
	 */
	public Animal(Boolean isAlive, int animalSize, int foodType) {
		super(isAlive);
		this.animalSize = animalSize;
		this.foodType = foodType;

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
		Animal other = (Animal) obj;
		if (animalSize != other.animalSize)
			return false;
		return true;
	}


	/**
	 * 
	 */
	public String toString() {
		String s = "";
		s = s + super.toString();
		s = "Animal size: " + animalSize + " kg. ";
		if (foodType == Animal.FOOD_ANIMALS) {
			s = s + " Eating animals. ";
		} else if (foodType == Animal.FOOD_PLANTS) {
			s = s + " Eating pnalts. ";
		}
		return s;

	}

}
