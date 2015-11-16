package ba.bitcamp.task4;

public class Zebra extends Animal {
	private int age;
	private int state;
	public static final int HEALTHY = 0;
	public static final int ILL = 1;
	public static final int DEADLY_ILL = 2;	
	
	/**
	 * 
	 * @param isAlive
	 * @param animalSize
	 * @param favoriteFood
	 */
	public Zebra(int animalSize, int age) {
		super(true, animalSize, Animal.FOOD_PLANTS);
		this.age = age;
		this.state = Zebra.HEALTHY;
		
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
		Zebra other = (Zebra) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
	/**
	 * 
	 */
	public String toString () {
		String s = "";
		s = s + super.toString(); 
		s = "Age: " + age + " ";
		if (state == Zebra.ILL) {
			s = s + " Ill.";
		} else if (state == Zebra.HEALTHY) {
			s = s + " Healty.";
		} else if (state == Zebra.DEADLY_ILL) {
			s = s + " Deadly ill.";
		}
		return s;
		
	}
    
}
