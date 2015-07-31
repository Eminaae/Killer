package ba.bitcamp.week10.day2.lectures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 643399343532249092L;
	private String name;
	private int age;
	
	/**
	 * Constructor
	 * @param name
	 * @param age
	 */
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return String.format("%s %d",name, age);
	}

	public static void main(String[] args) {
		User u = new User ("John", 26);
		OutputStream os;
		try {
			os = new FileOutputStream("user.dat", true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream is = new FileInputStream("user.dat");
		ObjectOutputStream osw= new ObjectOutputStream(os);
		try {
			osw.writeObject(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ObjectInputStream ois = new ObjectInputStream(is);
		User fromFile = (User)ois.readObject();
		System.out.println(fromFile);

	}

}
