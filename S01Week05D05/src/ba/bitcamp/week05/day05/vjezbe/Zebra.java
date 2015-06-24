package ba.bitcamp.week05.day05.vjezbe;

public class Zebra extends Animal{
	
	public Integer dob;
	public String state;
	public static final int HEALTHY = 1;
	public static final int DEADLY_SICK = 0;

	/**
	 */
	public Zebra() {
		super(isAlive, weigth, typeOfFood);
		this.dob = dob;
		this.state = state;
	}

	public Integer getDob() {
		return dob;
	}

	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static int getHealthy() {
		return HEALTHY;
	}

	public static int getDeadlySick() {
		return DEADLY_SICK;
	}

	@Override
	public String toString() {
		return "Zebra [dob=" + dob + ", state=" + state + ", getDob()="
				+ getDob() + ", getState()=" + getState() + ", toString()="
				+ super.toString() + ", getWeigth()=" + getWeigth()
				+ ", getTypeOfFood()=" + getTypeOfFood() + ", isAlive()="
				+ isAlive() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
		
}
