package vjezbeS10D01;

public class Application {
	private String name;
	private Integer year;
	private Integer version;
	private Integer size;
	
	/**
	 * @param name
	 * @param year
	 * @param version
	 * @param size
	 */
	public Application(String name, Integer year, Integer version, Integer size) {
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}

	public static class Editor {
		public enum type {TEXT, PHOTO, VIDEO};
		private boolean isFreeware;
		private String type;
		/**
		 * @param isFreeware
		 * @param type
		 */
		public Editor(boolean isFreeware, String type) {
			super();
			this.isFreeware = isFreeware;
			this.type = type;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Editor [isFreeware=" + isFreeware + ", type=" + type + "]";
		}
		
	}
	
	class VideoGame {
		private String gener;
		private String studio;
		private Integer numberOfCopy;
		
		/**
		 * @param gener
		 * @param studio
		 * @param numberOfCopy
		 */
		public VideoGame(String gener, String studio, Integer numberOfCopy) {
			super();
			this.gener = gener;
			this.studio = studio;
			this.numberOfCopy = numberOfCopy;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "VideoGame [gener=" + gener + ", studio=" + studio
					+ ", numberOfCopy=" + numberOfCopy + "]";
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Application [name=" + name + ", year=" + year + ", version="
				+ version + ", size=" + size + "]";
	}
	
}
