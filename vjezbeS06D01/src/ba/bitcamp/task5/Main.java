package ba.bitcamp.task5;

public class Main {

	public static void main(String[] args) {
		Manager.Person p = new Manager.Person();
		
		Manager.Salary s = new Manager.Salary ();
		
		Manager m = new Manager(p, s);
		
		m.setSalory(100, 5, 5, 2015);
		
		


	}

}
