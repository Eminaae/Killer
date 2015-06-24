package com.bitcamp.klase;

import com.bitcamp.klase.model.Person;
import com.bitcamp.klase.model.Test;

public class Structure {

	public static void main(String[] args) {
		/**
		 *Using arrays as a data structure
		 */
		String[] person1 = {"Tarik","Čelik","1986","Jadranska 9","A16F00A","187","1",
				"Software Developer", "Pasta","7UP","+387 61 829 621"};
		
		String[] person2 = {"Jon","Doe","1947","Radiceva 2","A1000","213","0",
				"Pekar","Grah","Boza","john.doe@pekar.ba","+387 999 999"};
		/*
		* Test.getOlderPerson(person1,person2);
		*/

			Person per1 = new Person("Tarik", "Čelik", 1986, "Jadranska 9", "A16F00A",
					"tarik.celik@bitcamp.ba", 187, true, "Pasta", "7UP");
			
			Person per2 = new Person("John", "Doe", 1947, "Radiceva 2", "A10000",
					"john.doe@pekara.ba", 213, false, "Grah", "Boza");
			
			Test.getOlderPerson(per1,per2);
			
			
			
	}

}
