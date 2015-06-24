
public class User {
	
	//create static variable, we do not need object for that
	public static int userCount = 0;
	
	private String name;
	private String surname;
	private Integer age;
	private int id; // we will generate id internally
	
	/*Constructor doesnt get age*/
	public User(String name, String surname) {
		this(name, surname, 0);
		
	}
	
	public User(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = ++userCount; 
}
	
	/*Because user id is private variable we need getter to print out from main name */
	
	public int getId(){ // we do not need setter because we will not allow anyone to change user id
		return id;
	}
	
	
	public String getName(){ 
		return name;
	}
	
	public String toString(){ // return string
		String output = String.format("Name : %s, Surname: %s, Id: %d", name, surname, id); 
		
		return output;
	}
	
	public boolean Equals(User other){//User other - we are getting other user
		if(this.name.equals(other.name) && this.surname.equals(other.surname) && this.age == other.age && this.id == other.id){ // we can not use equals method in class string. We have to create method, because java doesnt know what to compare
			return true;
		} else {
			return false;
		}
	}
	
	// We have to FIRST make constructor to make copy
	
	public User(User other){
		/*this.name = other.name;
		this.surname = other.surname;
		this.age = other.age;
		//this.id = other.id;
		this.id = ++userCount;
		
		The problem is that we have the same code like before, so we will write */
		this(other.name, other.surname, other.age);
		userCount --;
		this.id = other.id;
	}
	
}
