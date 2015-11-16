package vjezbeS10D01;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;

public class Task1 {

	public static <T> void printAll(Collection<T> col) {
		System.out.println(col);
	}

	public static <T> int countOccurences(Collection<T> col, T element) {
		int counter = 0;

		for (T el : col) {
			if (el.equals(element)) {
				counter++;
			} 
		}
		return counter;
	}

	public static <T extends Component> String printComponentInfo(T comp) {
		String s = "";
		s += "WIDTH: " + comp.getWidth() + " "; 
		s += "HEIGHT: " + comp.getHeight() + " ";
		s += "X: " + comp.getX() + " ";
		s += "Y: " + comp.getY() + " ";

		return s;
	}
	
	public static <T> String printType (Collection<T> coll) {
		String s = "";
		if (coll instanceof Map) {
			 s += "Collection is Map type.";
		} else if (coll instanceof List) {
			s += "Collection is List type.";
		} else if (coll instanceof Set) {
			s += "Collection is Set type.";
		}
		return s;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(2);

		printAll(list);
		System.out.println(countOccurences(list, 4));
		System.out.println(printComponentInfo(new JButton("OK")));
		
		System.out.println(printType(list));
	}

}
