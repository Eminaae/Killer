package ba.bitcamp.week05.day05.vjezbe;

public class Plant extends LifeForm {

	public static final int TOXIC = 0;
	public static final int LITTLE = 1;
	public static final int A_LOT = 2;
	public int amount;

	public Plant(boolean isAlive2) {
		super(isAlive2);

	}
}