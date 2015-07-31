package ba.bitcamp.week8.day3.vjezbe;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
	public static String getDay(int day) {

		ArrayList<String> days = new ArrayList<>(Arrays.asList("Manday",
				"Thusday", "Wednesday", "Thursday", "Friday", "Saturday",
				"Sunday"));
		return days.get(day - 1);
	}

	public static void main(String[] args) {

		System.out.println(getDay(2));

	}

}
