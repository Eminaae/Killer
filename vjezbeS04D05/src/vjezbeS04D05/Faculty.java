package vjezbeS04D05;

import java.util.Arrays;

public class Faculty {
	String name;
	Boolean isBologna;
	String[] departments;
	

public String toString() {
	String s = "Name: " + name + "\n";
	s = s + "Bologna? " + isBologna + "\n";
	s = s + Arrays.toString(departments);
	return s;
	}
}
