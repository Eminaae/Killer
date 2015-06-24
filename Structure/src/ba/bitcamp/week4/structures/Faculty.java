package ba.bitcamp.week4.structures;

import java.util.Arrays;

public class Faculty {

	String name;
	Boolean isBologna;
	String [] departments;

	@Override
	public String toString() {
	String s = "Name:" + name + "\n";
	s = s + "Bologna? " + isBologna + "\n";
	s = s + Arrays.toString(departments); // will put in string everything that returns this method
	
	return s;
	}
}
