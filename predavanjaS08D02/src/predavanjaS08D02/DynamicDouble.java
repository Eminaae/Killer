package predavanjaS08D02;

public class DynamicDouble {
	private double myArray[];
	private int count;

	/**
	 * 
	 */
	public DynamicDouble() {
		this(8);
	}

	/**
	 * 
	 * @param n
	 */
	public DynamicDouble(int n) {
		this(n, 0.0);
		this.count = 0;
	}

	/**
	 * 
	 * @param n
	 * @param x
	 */
	public DynamicDouble(int n, double x) {
		super();
		this.myArray = new double [n];
		this.count = n;
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = x;
		}
	}
	
	/**
	 * 
	 * @param x
	 */
	public void addElement (double x) {	
		if (count >= myArray.length) {
			double tmp[] = myArray;
			myArray = new double[myArray.length * 2 + 1];
			for (int i = 0; i < tmp.length; i++) {
				myArray[i] = tmp[i];
			}
		} else { 
			myArray[count] = x;
			count++;	
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public void addArray (double[] array) {
			for (int i = 0; i < myArray.length; i++) {
				addElement(array[i]);
			}
	}
	
	/**
	 * 
	 * @return
	 */
	public int size () {
		return count;
	}
	
	/**
	 * 
	 * @return
	 */
	public int totalSize () {
		return myArray.length;
	}
	
	/**
	 * 
	 * @return
	 */
	public String toString () {
		String s = size () + "\t[";
		for (int i = 0; i < count; i++) {
			s += myArray[i] + " ";
		}
		s += "]\n" + totalSize() + "\t[" ;
 		for (int i = 0; i < myArray.length; i++) {
 			s += myArray[i] + " ";
 		}
 		s += "]\n";
		return s;
	}
	
	/**
	 * 
	 * @param offset
	 */
	public void removQuick (int offset) {
		if ( count == 0) {
			throw new IndexOutOfBoundsException();
		}
		if (offset >= count) {
			throw new IndexOutOfBoundsException();
		}
		
		myArray[offset] = myArray[count - 1];
		count--;
		if (count <= myArray.length / 3) {
			double[] tmp = new double [totalSize() / 2];
			for (int i = 0; i < tmp.length; i++) {
				tmp[i] = myArray[i];
				myArray = tmp;
			}
		}
	}
	
	/**
	 * 
	 */
	public void removSlow () {
	
	}
}
