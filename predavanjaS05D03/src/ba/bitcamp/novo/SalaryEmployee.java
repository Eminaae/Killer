package ba.bitcamp.novo;

public class SalaryEmployee extends Employee{ //extendes naslijedjuje klasu employee
	
	private int salary;
	
	public SalaryEmployee(String name, String gender, int salary) {
		super(name, gender); //poziva konstruktor klase koju smo naslijedili i prima sta vec prima taj konstrukot
		this.salary = salary;
	}
	
	public String toString() {
		return "Salary Employee: " + name + " " + " " + salary;
	}
	
	
	

}
