package ba.bitcamp.klasa;

public class Main {
	
	

	public static void main(String[] args) {
		
		User u = new User("John", "Doe");
	    
		User u2 = new User("Joe", "Bloggs", 12);
		
		System.out.println(u.getName() + " " + u.getId());
		System.out.println(u2.getName() + " " + u2.getId());
		
		

	}

}
