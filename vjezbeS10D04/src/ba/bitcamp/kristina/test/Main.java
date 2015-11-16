package ba.bitcamp.kristina.test;

import java.util.ArrayList;

import ba.bitcamp.kristina.test.Artifacts.Era;
import ba.bitcamp.kristina.test.WorksOfArt.CourseInArt;

public class Main {

	public static void main(String[] args) {

		Showpiece s1 = new Showpiece(5, "name1", "ekspponat1");
		Showpiece s2 = new Showpiece(2, "name2", "ekspponat2");
		ArrayList<Showpiece> s = new ArrayList<>();
		s.add(s1);
		s.add(s2);

		WorksOfArt woa1 = new WorksOfArt(6, "slika1", "davincijevaslika",
				"Leonardo", CourseInArt.MODERN);
		WorksOfArt woa2 = new WorksOfArt(645, "slika5", "Cas Anatomije",
				"Rembrant", CourseInArt.RENIASSANCE);

		ArrayList<WorksOfArt> woa = new ArrayList<>();
		woa.add(woa1);
		woa.add(woa2);

		Artifacts a1 = new Artifacts(39, "noz", "za lov", "egipatski noz",
				Era.MIDDLE_AGES);
		Artifacts a2 = new Artifacts(16, "Napoleonov sesir",
				"sesir sa nekog bala", "nosen na balu u venciji",
				Era.MODERN_TIME);

		ArrayList<Artifacts> a = new ArrayList<>();
		a.add(a1);
		a.add(a2);

		Employee e1 = new Employee("Mujo Mujic", 450);
		Employee e2 = new Employee("Fata Mujic", 400);

		ArrayList<Employee> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);

		Museum m = new Museum(s, woa, a, e);

		System.out.println(m);

		System.out.println("Da li eksponat s1 ima ime nam? "
				+ s1.fitsSearch("nam"));

		System.out.println("Da li se radnik e1 zove Mujo Mujic? "
				+ e1.fitsSearch("Mujo Mujic"));

	}

}
