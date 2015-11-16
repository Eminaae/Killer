package vjezbeS05D01;

public class Player {
	private String name;
	private String club; 
	private String nationality;
	private int goalsScore;
	
	public Player(String name, String club, String nationality, int goalsScore){
		this.name = name;
		this.club = club;
		this.nationality = nationality;	
		goalsScore = 0;
	}
	
	public void addGolas() {
		 goalsScore += goalsScore;
	}
	public String toString() {
		return "Name: " + name + "\n" +
				"Club: " + club  + "\n" +
				"Nationality: " + nationality + "\n";
	}

}
