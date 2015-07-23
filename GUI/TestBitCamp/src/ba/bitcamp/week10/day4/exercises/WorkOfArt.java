package ba.bitcamp.week10.day4.exercises;

public class WorkOfArt extends MuseumPiece {

	enum period {
		RENAISSANCE, NEOCLASSIC, MODERN, CONTEMPORARY_ART
	}

	private String authorName;

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param authorName
	 */
	public WorkOfArt(int id, String name, String description, String authorName) {
		super(id, name, description);
		this.authorName = authorName;
	}

}
