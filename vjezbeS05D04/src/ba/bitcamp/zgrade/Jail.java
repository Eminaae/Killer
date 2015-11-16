package ba.bitcamp.zgrade;

public class Jail extends Building {
	public Integer numberOfCells;
	public Integer numberOfFreeCells;
	public Integer securityLevel;
	public Boolean hasGym;
	
	public int getNUmberOfOccupiedCells () {
		return numberOfCells - numberOfFreeCells;
	}

}
