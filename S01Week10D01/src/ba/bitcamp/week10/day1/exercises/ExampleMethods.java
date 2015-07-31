package ba.bitcamp.week10.day1.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class ExampleMethods {

	/*
	 * Generic methods
	 * Generic classes
	 * Misc.
	 */
		
	// Wildcard
	public static <T extends JComponent> void print(T object) {
		System.out.println(object);
	}
	
	// Adding ovals to rect
	
	public static void printAll3(Collection<Number> col) {
		System.out.println(col);		
	}
	
	public static <T> void printAll(Collection<T> col) {
		System.out.println(col);		
	}
	
	public static void printAll2(Collection<JButton> col) {
		System.out.println(col);
	}
	
	public static <T> T getFirst(Collection<T> col) {
		Iterator<T> it = col.iterator();
		
		return it.next();
	}
	
	// Nidal ima pitanje
	
	public static void main(String[] args) {
//		print(5); Illegal! Integer not a subclass of JComponent
		print(new JButton("2"));
		print(new JLabel("asdasd"));
		
		
		
		ArrayList<JButton> list = new ArrayList<>();
		list.add(new JButton("OK"));
		list.add(new JButton("Cancel"));
		list.add(new JButton("Exit"));
		
		printAll(list);
		printAll2(list);
	}
	
	

}
