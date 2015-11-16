package task4;

public class Team {
	private Integer id;
	private String name;
	private Integer wins;
	private Integer losses;
	private Integer points;
	private Integer scoredplus;
	private Integer scoredminus;
	private String fromgroup;

	/**
	 * @param id
	 * @param name
	 * @param wins
	 * @param losses
	 * @param points
	 * @param scoredplus
	 * @param scoredminus
	 * @param fromgroup
	 */
	public Team(Integer id, String name, Integer wins, Integer losses,
			Integer points, Integer scoredplus, Integer scoredminus,
			String fromgroup) {
		this.id = id;
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.points = points;
		this.scoredplus = scoredplus;
		this.scoredminus = scoredminus;
		this.fromgroup = fromgroup;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the wins
	 */
	public Integer getWins() {
		return wins;
	}

	/**
	 * @param wins
	 *            the wins to set
	 */
	public void setWins(Integer wins) {
		this.wins = wins;
	}

	/**
	 * @return the losses
	 */
	public Integer getLosses() {
		return losses;
	}

	/**
	 * @param losses
	 *            the losses to set
	 */
	public void setLosses(Integer losses) {
		this.losses = losses;
	}

	/**
	 * @return the points
	 */
	public Integer getPoints() {
		return points;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public void setPoints(Integer points) {
		this.points = points;
	}

	/**
	 * @return the scoredplus
	 */
	public Integer getScoredplus() {
		return scoredplus;
	}

	/**
	 * @param scoredplus
	 *            the scoredplus to set
	 */
	public void setScoredplus(Integer scoredplus) {
		this.scoredplus = scoredplus;
	}

	/**
	 * @return the scoredminus
	 */
	public Integer getScoredminus() {
		return scoredminus;
	}

	/**
	 * @param scoredminus
	 *            the scoredminus to set
	 */
	public void setScoredminus(Integer scoredminus) {
		this.scoredminus = scoredminus;
	}

	/**
	 * @return the fromgroup
	 */
	public String getFromgroup() {
		return fromgroup;
	}

	/**
	 * @param fromgroup
	 *            the fromgroup to set
	 */
	public void setFromgroup(String fromgroup) {
		this.fromgroup = fromgroup;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", wins=" + wins
				+ ", losses=" + losses + ", points=" + points + ", scoredplus="
				+ scoredplus + ", scoredminus=" + scoredminus + ", fromgroup="
				+ fromgroup + "]\n";
	}

}
