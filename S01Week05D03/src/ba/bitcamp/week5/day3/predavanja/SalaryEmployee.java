package ba.bitcamp.week5.day3.predavanja;

public class SalaryEmployee extends Employee{
	private int salary;
	
	public SalaryEmployee(String name, String gender, int salary){
		super(name, gender);
		this.salary = salary;
		
	}
		public String toString(){
			return "Employee class: " + name + "" + gender;
			
	}

}
