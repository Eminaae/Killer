package predavanjaS08D02;

public class Test {

	public static void main(String[] args) {
		double [] array = new double[2];
		DynamicDouble array1 = new DynamicDouble(6, 3.0);
		//array1.addArray(array);
		array1.addElement(7);
		array1.size();
		System.out.println(array1.toString());
		array1.removQuick(5);
		System.out.println(array1.toString());

	}

}
