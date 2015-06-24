package ba.bitcamp.homework05.task01;

public class MainStory {

	public static void main(String[] args) {
		//Creating 4 objects of class Character
				Character c1 = new Character("Simba", "Male", true, true); 
				Character c2 = new Character("Mufasa", "Male", false, false); 
				Character c3 = new Character("Nala", "Female", true, true); 
				Character c4 = new Character("Scar", "Male", true, true); 
				
				Event e1 = new Event(3); 
				Event e2 = new Event(2); 

				Goal g1 = new Goal("Revenge", 1, e1, c2); 
				Goal g2 = new Goal("Friendship", 1, e2, c3); 
				System.out.println(g1);
				System.out.println(g2);
				Protagonist p1 = new Protagonist("Simba", "Male", true, g1); 
				p1.setEnemy(c2); //sets enemy
				
				
				System.out.println(c1);
				c1.transmuteCharacter(); //if his inCapable = false, setting to to true;
				System.out.println();
				System.out.println(c1); //printing out same Character with changes
				c1.killCharacter(); //killing that character
				System.out.println();
				System.out.println(c1); //printing out same Character with changes(Dead)
				System.out.println();
				System.out.println(c2); //printing out same Character with changes(Dead)
				System.out.println();
				
				
				p1.addHelpingCharacter(c1);
				p1.addHelpingCharacter(c2);
				p1.addHelpingCharacter(c3);
				System.out.println(p1.getHelpingCharacters()); //printing them all out
				
				//printing results of method attainGoal which checks us if
				//protagonist gona succeed at his goal or not
				p1.attainGoal();
				

	}

}