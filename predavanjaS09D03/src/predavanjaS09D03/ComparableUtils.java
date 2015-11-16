package predavanjaS09D03;

public class ComparableUtils {
	
	public static Student max (Student[] arr) {
		
		if (arr != null && arr.length > 0) {
			Student max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (max.compareTo(arr[i]) < 0) {
					max = arr[i];
				}
			}
			return max;
		}
		throw new UnsupportedOperationException("Array must be none");
	}
	
	public static <T extends Comparable<T>> T maxComparable (T[] arr) {
		
		if (arr != null && arr.length > 0) {
			T max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max.compareTo(arr[i]) < 0) {
					max = arr[i];
				}
			}
			return max;
		}
		throw new UnsupportedOperationException("Array must be none");
	}
	
	public static void main(String[] args) {
		Student[] students = {new Student("ABC"), new Student("XZY")};
		System.out.println(ComparableUtils.max(students));
		Student st = ComparableUtils.maxComparable(students);
		//System.out.println(ComparableUtils.maxComparable(students));
		System.out.println(st);
		
		String[] predmeti ={"IT", "MAT", "EL"};
		
		String pr = ComparableUtils.maxComparable(predmeti);
		System.out.println(pr);
	}
}
