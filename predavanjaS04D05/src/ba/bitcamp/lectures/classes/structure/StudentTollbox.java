package ba.bitcamp.lectures.classes.structure;

public class StudentTollbox {
	public static double izracunajProsjek (Student student) {
		if (student.ocjene != null) {
			int sumaOcjena = 0;
			int polozenoPredmeta = 0;
			for(Ocjena ocjena : student.ocjene) {
				if (ocjena.ocjena > 5) {
					sumaOcjena += ocjena.ocjena;
					polozenoPredmeta++;
				}
			}
			return (double) sumaOcjena / polozenoPredmeta;
		}
		return Double.NaN;
	}
	public static void postaviProsjek(Student student) {
		student.prosjek = izracunajProsjek (student);
		
	}

}
