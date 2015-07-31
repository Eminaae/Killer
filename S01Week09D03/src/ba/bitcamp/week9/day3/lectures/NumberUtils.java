package ba.bitcamp.week9.day3.lectures;

public class NumberUtils {
	
	/**
	 * Returns max value from array
	 * @param nums
	 * @return
	 */
	public static int max(int[] nums){
		if(nums != null && nums.length > 0){
		int max = nums[0];
		for(int i = 0; i < nums.length; i++){
			if(max < nums[i]){
				max = nums [i];
			}
		}
		return max;
		}
		throw new UnsupportedOperationException("Array must be nonempty");
	}
	
	public static Number max(Number[] nums){
		if(nums != null && nums.length > 0){
		double max = nums[0].doubleValue();
		for(int i = 0; i < nums.length; i++){
			if(max < nums[i].doubleValue()){
				max = nums [i].doubleValue();
			}
		}
		return max;
		}
		throw new UnsupportedOperationException("Array must be nonempty");
	}




	public static void main(String[] args) {
		int[] nums = {1, 250, 100, 8, 23};
		System.out.println(NumberUtils.max(nums));
		
		
		Integer[] objInts = {1, 250, 100, 8, 23};
		System.out.println(NumberUtils.max(objInts));
		
		
		Double[] objDoubles = {1.0, 250.2, 100.3, 8.2, 23.3};
		System.out.println(NumberUtils.max(objInts));
		
		Number[] objNums = {1, 250, 100, 8, 23};
		System.out.println(NumberUtils.max(objNums));
	}

}
