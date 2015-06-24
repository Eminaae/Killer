
public class Main {

	public static void main(String[] args) {
		System.out.println("User count" + User.userCount);
		
		User u = new User ("John", "Doe");
		System.out.println("User count: " + User.userCount);
		User u2 = new User ("Ed", "N", 12);
		System.out.println("User count: " + User.userCount);
		
		System.out.println(u.getName() + " " + u.getId());
		System.out.println(u2.getName() + " " + u2.getId());
	}

}
