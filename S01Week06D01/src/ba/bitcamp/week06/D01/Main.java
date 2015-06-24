package ba.bitcamp.week06.D01;

public class Main {

	public static Compare getMax(Compare[] array) {
		Compare max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max.compare(array[i]) == -1) {
				max = array[i];
			}
		}
		return max;
	}

	
	public static void main(String[] args) {
		Foo[] array = new Foo[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Foo(i + 1);
		}

		
		Bar[] barArray = new Bar[3];
		barArray[0] = new Bar ("A");
		barArray[1] = new Bar ("AB");
		barArray[2] = new Bar ("ABC");
		
		System.out.println(getMax(array));
		System.out.println(getMax(barArray));
	}

}

