package ba.bitcamp.week05.day05.vjezbe;

public class Tiger extends Animal{
	public Integer speed;
	public Boolean stage;
	public static final int INACTIVE = 0;
	public static final int HUNTING = 1;
	public static final int HUNGRY = 2;
	
	public Tiger(Integer weigth, int typeOfFood, Integer speed, Boolean hungry2) {
		super(hungry2, weigth, typeOfFood);
		this.speed = speed;
		this.stage = hungry2;
	}
	
}
