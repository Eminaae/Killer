package ba.bitcamp.klasa;

public class User {

	private static int userCount = 0;

	private String name;
	private String surname;
	private int id;
	private int age;

	public User(String name, String surname) {
		this(name, surname, 0);
	}

	public User(String somethingelse, String surname, int age) {
		name = somethingelse; // moze i bez this, this ako smo isto nazvali
								// varijable
		this.surname = surname;
		this.age = age;
		this.id = ++userCount;
	}
	public User(User other){
		this(other.name, other.surname, other.age);
		userCount--;
		this.id = other.id;
	/*	moze i ovako, ali pisemo razlicito da se ne ponavljamo u kodu
	 * this.name = other.name;
		this.surname = other.surname;
		this.age = other.age;
		this.id = other.id;
		//this.id = ++userCount; ako zelimo drugi id
		*/
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getId() {
		return id;
	}
    /**
     * poredi dva user-a
     * @param other
     * @return
     */
	public boolean equals(User other) {
		if (this.name.equals(other.name) && this.surname.equals(other.surname)
				&& this.age == other.age && this.id == other.id) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		String output = String.format("Name: %s, Surname: %s, Id: %d", name,
				surname, id);
		return output;
	}

}
