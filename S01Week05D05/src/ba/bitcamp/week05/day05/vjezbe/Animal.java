package ba.bitcamp.week05.day05.vjezbe;

public class Animal extends LifeForm {
	public static Integer weigth;
	@Override
	public String toString() {
		return "Animal [typeOfFood=" + typeOfFood + ", getWeigth()="
				+ getWeigth() + ", getTypeOfFood()=" + getTypeOfFood() + "]";
	}

	public static int typeOfFood;
	public static final int EAT_ANIMALS = 0;
	public static final int EAT_PLANTS = 1;

	/**
	 * @param weigth
	 * @param eatPlants
	 */
	public Animal(Boolean isAlive,Integer weigth, int eatPlants) {
		super(false);
		Animal.weigth = weigth;
		Animal.typeOfFood = eatPlants;
	}


	public Integer getWeigth() {
		return weigth;
	}

	public void setWeigth(Integer weigth) {
		Animal.weigth = weigth;
	}

	public int getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(int typeOfFood) {
		Animal.typeOfFood = typeOfFood;
	}

	public static int getEatAnimals() {
		return EAT_ANIMALS;
	}

	public static int getEatPlants() {
		return EAT_PLANTS;
	}

}
