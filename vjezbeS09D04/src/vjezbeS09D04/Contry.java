package vjezbeS09D04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;

public class Contry {
	String name;
	int population;
	int area;

	/**
	 * @param name
	 * @param population
	 * @param area
	 */
	public Contry(String name, int population, int area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public enum SortingContry {
		NAME, POPULATION, AREA
	};

	EnumSet<SortingContry> set = EnumSet.of(SortingContry.AREA,
			SortingContry.NAME, SortingContry.POPULATION);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contry [name=" + name + ", population=" + population
				+ ", area=" + area + "]";
	}

	/**
	 * 
	 * @param list
	 * @param set
	 */
	public static void sort(ArrayList<Contry> list, EnumSet<SortingContry> set) {
		if (set.contains(SortingContry.NAME)) {
			Collections.sort(list, new Comparator<Contry>() {

				@Override
				public int compare(Contry c1, Contry c2) {
					return c1.name.compareTo(c2.name);
				}
			});
		} else if (set.contains(SortingContry.AREA)) {
			Collections.sort(list, new Comparator<Contry>() {

				@Override
				public int compare(Contry c1, Contry c2) {
					return c1.area - c2.area;
				}
			});
		} else if (set.contains(SortingContry.POPULATION)) {
			Collections.sort(list, new Comparator<Contry>() {

				@Override
				public int compare(Contry c1, Contry c2) {
					return c1.population - c2.population;
				}
			});
		}
	}

	public static void main(String[] args) {
		Contry c = new Contry ("Contry1" , 100, 200);
		Contry c1 = new Contry ("Contry23" , 300, 10);
		Contry c2 = new Contry ("Contry" , 30, 7000);
		
		ArrayList<Contry> list = new ArrayList<Contry>();
		
		list.add(c1);
		list.add(c2);
		list.add(c);
		
		System.out.println(list);
		
		EnumSet<SortingContry> set = EnumSet.of(SortingContry.AREA,
				SortingContry.NAME, SortingContry.POPULATION);

		
		sort(list, set);
		
		System.out.println(list);

	}

}
