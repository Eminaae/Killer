package predavanjaS09D03;

public class NumberUtils {
//	int[] array;
//	
//	public NumberUtils (int[] array){
//		this.array  = array;
//	}
//	
//	public int sum () {
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		return sum;
//	}
	
	public static Double max (Number[] nums) {
		
		if (nums != null && nums.length > 0) {
			double max = nums[0].doubleValue();
			for (int i = 0; i < nums.length; i++) {
				if (max < nums[i].doubleValue()) {
					max = nums[i].doubleValue();
				}
			}
			return max;
		}
		throw new UnsupportedOperationException("Array must be none");
	}

	public static void main(String[] args) {
		Number[] num = {1, 2, 3, 4};
        //NumberUtils n = new NumberUtils(array);
       // System.out.println(n.sum());
        System.out.println(NumberUtils.max(num));
	}

}
