package ba.bitcamp.lectures.classes.structure;

public class StudentskaSluzba {
	public static void main(String[] args) {
		Student st = new Student();
		st.ime = "Niko";
		st.prezime = "Nikic";
		st.ocjene = new Ocjenep[3];
		
		Ocjena prvaOcjena= new Ocjena();
		prvaOcjena.predmet = "Prvi predmet";
		prvaOcjena.ocjena = 5;
		
		st.ocjene[0] = prvaOcjena;
		
		st.ocjene[1] = new Ocjena();
		st.ocjene[1].predmet = "Drugi predmet";
		st.ocjene[1].ocjena = 5;
		
		st.ocjene[2] = new Ocjena();
		st.ocjene[2].predmet = "Drugi predmet";
		st.ocjene[2].ocjena = 5;
		
		StudentToolbox.postaviProsjek();
		System.out.println("Prosjek: " + st.prosjek);
		
		//polaze prvi predmet
		st.ocjene[0].ocjena = 8;
		StudentToolbox.postaviProsjek();
		System.out.println("Novi prosjek: " + st.prosjek);
		
		//nova radnic au studenskoj
		st.ocjene[1].ocjena = 6;
		st.prosjek = (st.prosjek + 6) /2;
		System.out.println("Prosjek: " + st.prosjek);
		
		
		
	}

}
