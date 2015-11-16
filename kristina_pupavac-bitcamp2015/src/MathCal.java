import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathCal {
	public static Integer result = 0;
	public static String rawInput = "";
	public static String output = "";
	public static int hold;
	public static String[] num = new String[] {};

	/**
	 * 
	 * @param expresion
	 * @return
	 */
	public static Integer getIntResult(String expresion) {

		try {

			if (expresion.contains("+") || expresion.contains("-")
					|| expresion.contains("*") || expresion.contains("/")) {
				List<Integer> numbers = new ArrayList();
				List<Character> operations = new ArrayList();
				char[] charExpresion = expresion.toCharArray();
				for (int i = 0; i < charExpresion.length; i++) {
					if (charExpresion[i] == '+' || charExpresion[i] == '-'
							|| charExpresion[i] == '*'
							|| charExpresion[i] == '/') {
						operations.add(charExpresion[i]);
					} else {
						if (Character.isDigit(charExpresion[i])) {
//							 char[] op = new char[] {'+', '-','*','/'};
//							 for(int k = 0; k < op.length; k++) {
//							 num = expresion.split(k+"");
//							 }
//							 for(int z =0; z< num.length; z++) {
//							 numbers.add(Integer.parseInt(num[z]));
//							}
//							
							numbers.add(Integer.parseInt(charExpresion[i] + ""));
						}

					}
				}
				System.out.println(numbers.toString());
				System.out.println(operations.toString());
				for (int i = 0; i < numbers.size(); i++) {
					for (int j = 0; j < operations.size(); j++) {
						if (operations.size() >= 2 && operations.get(j) == '+'
								&& operations.get(1) == '-') {
							result = numbers.get(i) + numbers.get(i + 1)
									- numbers.get(i + 2);
						} else if (operations.size() >= 2
								&& operations.get(j) == '-'
								&& operations.get(1) == '+') {
							result = numbers.get(i) - numbers.get(i + 1)
									+ numbers.get(i + 2);
						} else if (operations.size() >= 2
								&& operations.get(j) == '+'
								&& operations.get(1) == '+') {
							result = numbers.get(i) + numbers.get(i + 1)
									+ numbers.get(i + 2);
						} else if (operations.size() >= 2
								&& operations.get(j) == '-'
								&& operations.get(1) == '-') {
							result = numbers.get(i) - numbers.get(i + 1)
									- numbers.get(i + 2);
						} else if (operations.get(j) == '+') {
							result = numbers.get(i) + numbers.get(i + 1);
						} else if (operations.get(j) == '-') {
							result = numbers.get(i) - numbers.get(i + 1);
						} else if (operations.get(j) == '*') {
							result = numbers.get(i) * numbers.get(i + 1);
						} else if (operations.get(j) == '/') {
							result = numbers.get(i) / numbers.get(i + 1);
						}

						return result;
					}
				}

			}

			/*
			 * if (expresion.contains("+")) { String[] numbers =
			 * expresion.split("+"); result = Integer.parseInt(numbers[0]) +
			 * Integer.parseInt(numbers[1]);
			 * 
			 * return result;
			 * 
			 * } else if(expresion.contains("-")) { String[] numbers =
			 * expresion.split("-"); result = Integer.parseInt(numbers[0]) -
			 * Integer.parseInt(numbers[1]);
			 * 
			 * return result;
			 * 
			 * } else if (expresion.contains("*")) { String[] numbers =
			 * expresion.split("*"); result = Integer.parseInt(numbers[0]) *
			 * Integer.parseInt(numbers[1]);
			 * 
			 * return result;
			 * 
			 * } else if (expresion.contains("/")) { String[] numbers =
			 * expresion.split("/"); result = Integer.parseInt(numbers[0]) /
			 * Integer.parseInt(numbers[1]);
			 * 
			 * return result;
			 * 
			 * }
			 */

		} catch (NumberFormatException ex) {
			System.out.println("You entered an invalid number!");
		}

		return Integer.parseInt(expresion);
	}

	/**
	 * 
	 * @param hold
	 * @return
	 */
	private static String ones(int hold) {
		String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine" };
		int x = Character.getNumericValue(rawInput.charAt(hold));
		int y = 0;
		for (int i = 1; i < 10; i++) {
			if (i == x) {
				y = i;
				break;
			}
		}
		return " " + ones[y];
	}

	/**
	 * 
	 * @param hold
	 * @return
	 */
	public static String teens(int hold) {
		String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
				"Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nighteen" };
		int x = Character.getNumericValue(rawInput.charAt(hold));
		int y = 0;
		for (int i = 0; i < 10; i++) {
			if (i == x) {
				y = i;
				break;
			}
		}
		return " " + teens[y];
	}

	/**
	 * 
	 * @param hold
	 * @return
	 */
	private static String tens(int hold) {
		String[] tens = { "", "Ten", "Twenty", "Thirty", "Fourty", "Fifty",
				"Sixty", "Seventy", "Eighty", "Ninety" };
		int x = Character.getNumericValue(rawInput.charAt(hold));
		int y = 0;
		for (int i = 0; i < 10; i++) {
			if (i == x) {
				y = i;
			}
		}
		return " " + tens[y];
	}

	/**
	 * 
	 * @param hold
	 * @return
	 */
	private static String hundreds(int hold) {
		return ones(hold) + " Hundred";
	}

	/**
	 * 
	 * @param hold
	 * @return
	 */
	private static String thousands(int hold) {
		return ones(hold) + " Thousand";
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private static String getStringResult(int input) {
		if (input == 0) {
			output += "Zero";
		} else if (input < 10) {
			output += ones(0);
		} else if (input < 20) {
			output += teens(0);
		} else if (input < 100) {
			output += tens(0);
			output += ones(1);
		} else if (input < 1000) {
			output += hundreds(0);
			int temp = Integer.parseInt(rawInput.substring(1, 3));
			if (temp > 10 && temp < 20) {
				output += teens(2);
			} else {
				output += tens(1);
				output += ones(2);
			}

		} else if (input < 10000) {
			output += thousands(0);
			output += hundreds(1);
			int temp = Integer.parseInt(rawInput.substring(2, 4));
			if (temp > 10 && temp < 20) {
				output += teens(3);
			} else {
				output += tens(2);
				output += ones(3);
			}

		}

		return output;
	}

	public static void main(String[] args) {
		System.out.println("Enter numbers and operation: ");
		String input = new Scanner(System.in).nextLine();
		System.out.println("Result is: " + getIntResult(input));
		rawInput = input;
		System.out.println("Number is:"
		 + getStringResult(Integer.parseInt(input)));
	}

}
