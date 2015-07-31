package ba.bitcamp.week10.day1.task04;

public class Application<T> {
	private String name;
	private int year;
	private int version;
	private int size;
	/**
	 * @param name
	 * @param year
	 * @param version
	 * @param size
	 */
	public Application(String name, int year, int version, int size) {
		super();
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}

	private class Editor{
		private T Text;
		private T Photo;
		private T Video;
		private boolean freeware = false;
		/**
		 * @param text
		 * @param photo
		 * @param video
		 * @param freeware
		 */
		
		public Editor(T text, T photo, T video, boolean freeware) {
			super();
			Text = text;
			Photo = photo;
			Video = video;
			this.freeware = freeware;
		}	
	}
	
	private class VideoGame{
		private String genre;
		private String studio;
		private int sold;
	}
}
