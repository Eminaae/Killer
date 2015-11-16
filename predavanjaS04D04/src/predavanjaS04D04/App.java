package predavanjaS04D04;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Using arrays as a data structure 
		 */
		String[] person1 = {"Tarik", "Celik", "1986", "Jadranska 9", "A16FOOA", "187", "1", "Software Developer", "Pasta" , "7UP", "tarik.celik@bitcamp.ba", "+387 61 829 621"};
		String[] person2 = {"John", "Doe", "1947", "Radiceva 2", "A100000", "213" , "0", "Pekar", "Grah", "Boza", "johndoe@pekara.ba", "+387 61 999 999"};
		//Test.getOlderPerson(person1, person2);
		/*
		 * Using classes as data structure
		 */
		
		Person per1 = new Person ("Tarik", "Celik", 1986, "Jadranska 9", "A16F00A", "tarik.celik@bitcamp.ba", 187, true, "Pasta", "7UP");
		Person per2 = new Person ("John", "Doe", 1947, "Radiceva 2", "A100000", "john.doe@pekara.ba", 213, false, "Grah", "Boza");
		
		Test.getOlderPersonObject(per1, per2);

	}

}
