package predavanjaS10D02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;


public class User implements Serializable{
	private static final long serialVersionUID = 5944648994217392470L;
	
	private String name;
	private int age;
	
	/**
	 * @param name
	 * @param age
	 */
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return String.format("%s %d", name, age);
	}

	public static void main(String[] args) {
		
		User u = new User ("John", 26);
			
		try {
			OutputStream os = new FileOutputStream("user.dat", true);
			InputStream is = new FileInputStream("user.dat");
			ObjectOutputStream osw = new ObjectOutputStream (os);
			osw.writeObject(u);
			
			ObjectInputStream ois = new ObjectInputStream(is);
			User fromFile = (User)ois.readObject();
			System.out.println(fromFile);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
