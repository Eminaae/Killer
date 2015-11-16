package ba.bitcamp.novo;

public class HourlyEmployee extends Employee{
	
	private int haourlyRate;
	
	public HourlyEmployee(String name, String gender, int hourlyRate) {
		super(name, gender);
		this.haourlyRate = haourlyRate;
	}
	

}
