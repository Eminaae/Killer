package ba.bitcamp.week8.day1.vjezbe;

import java.util.Arrays;

public class DynamicDouble {

	private double myArray[];
	private int count;

	public DynamicDouble() {
		this(8);
	}

	public DynamicDouble(int n) {
		this(n, 0.0);
		count = 0;
	}

	public DynamicDouble(int n, double x) {
		super();
		myArray = new double[n];
		count = n;
		for (int i = 0; i < n; i++) {
			myArray[i] = x;
		}
	}

	public void addElement(double x) {
		if (count >= myArray.length) {
			double tmp[] = myArray;
			myArray = new double[myArray.length * 2]; // napravimo veci niz
			for (int i = 0; i < tmp.length; i++) {
				myArray[i] = tmp[i];
			}
		}
		myArray[count] = x;
		count++;
	}

	public void addElement(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			addElement(arr[i]);
		}

	}

	public int size(int counter) {
		return counter;
	}

	public double totalSize(double arr[]) {
		return arr.length;

	}

	@Override
	public String toString() {
		String s = count + "\t[";
		for (int i = 0; i < count; i++) {
			s += myArray[i] + "  ";
		}

		s += "]\n" + totalSize(myArray) + "\t[";

		for (int i = 0; i < myArray.length; i++) {
			s += myArray[i] + "  ";
		}

		s = "]";
		return s;

	}
	
	public int removeQuick(int offset)throws IndexOutOfBoundsException{
		if (count == 0 ) throw new IndexOutOfBoundsException();
		myArray[offset] = myArray [count -1];
		count--;
		if(count <= myArray.length / 3){
			double temp[] = new double[totalSize()/7];
			for(int i = 0; i < temp.length; i++){
				temp[i] = myArray[i];
				myArray = temp;
			}
		}
		return offset;
		}
	
	public static slowRemove(int []arr, int n){
		int lowest = 0;
		int highest = arr.length -1;
		
		while(highest >= lowest){
			int middle = 
		}
	}

	public static void main(String[] args) {

		int counter = 3;

	}
}
