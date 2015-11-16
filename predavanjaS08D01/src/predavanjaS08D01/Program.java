package predavanjaS08D01;

public class Program {
	//dozvoljava proizvoljan broj parametara
	//ne moze nisya iza smao ispred jos parametara
	//npr(int size, int... params)
	private static int sumParams(int... params){
		int sum = 0;
		for (int i = 0; i < params.length; i++) {
			sum += params[i];
		}
		return sum;
	}
	
	private static String stringify(Object... params) {
		StringBuilder sb = new StringBuilder();
		for (Object s : params) {
			sb.append(s);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(sumParams(1, 2, 3, 4, 5, 6));
		System.out.println(sumParams(1, 2));
		System.out.println(sumParams(1));
		System.out.println(sumParams());
		System.out.println(sumParams(new int[]{4, 5, 6}));
		
		System.out.println(stringify("Neki", "String"));
		System.out.println(stringify(1, 2, 3, 4, 5, 6));

	}

}
