package ba.bitcamp.week10.day2.exercises;

import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExampleObjects {

	public static void main(String[] args) {
		// Writing an object to a file
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("text.txt")));
		
			oos.writeObject(new Point(2, 5));
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Reading an object from a file
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("text.txt")));
		
			Point p = (Point) ois.readObject();
			System.out.println(p.x);
			System.out.println(p.y);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}

