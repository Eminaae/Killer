package ba.bitcamp.week05.day4;

public class Jail extends Building{
	public Integer numberOfCells;
	public Integer numberOfFreeCells;
	public Integer securityLevel;
	public Boolean hasGym;
	
	public int getNumberOfOccupiedCells(){
		return numberOfCells - numberOfFreeCells;
	}
	
}