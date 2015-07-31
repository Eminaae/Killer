package ba.bitcamp.week10.day1.lectures;

import java.awt.Component;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

public class GenericMethods {

	public static <T> void printAll(Collection<T> col) {
		System.out.println(col);
	}
	
	public static <T> int countOccurances(Collection<T> col, T element) {
		Iterator<T> it = col.iterator();
		int count = 0;
		while (it.hasNext()) {
			if (it.next().equals(element)) {
				count++;
			}
		}
		return count;
	}
	
	
	public static <T extends Component>  void pritnComponentInfo(T el){
		System.out.println(el.getWidth()+ " width \n" + el.getHeight() + " height \n " + el.getX() + " X \n" + el.getY() + " Y");
	}

	
	public static <T> void printType(Collection<T> col){
		if(col instanceof Map){
			System.out.println(col + "Mapa");
		}
		if(col instanceof List){
			System.out.println(col + "Lista");
		}
		
	}
	
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("ok");
		list.add("end");
		list.add("start");
		list.add("ok");
		printAll(list);
		System.out.println(GenericMethods.countOccurances(list, "ok"));
		
		JPanel p = new JPanel();
		p.setBounds(3, 2, 4, 5);
		GenericMethods.pritnComponentInfo(p);
		GenericMethods.printType(list);
		
		
		//System.out.println(GenericMethods.pritnComponentInfo(p));
		
	}
}
