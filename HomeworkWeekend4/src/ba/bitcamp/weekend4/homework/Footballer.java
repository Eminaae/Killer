package ba.bitcamp.weekend4.homework;

public class Footballer {

		public String name;
		public Integer yob;
		public String position;
		String[] footballers;
		
		/**
		 * Constructor represents footballer.
		 * @param name
		 * @param yob
		 * @param position
		 */
		public Footballer(String name, Integer yob, String position) {
			super();
			this.name = name;
			this.yob = yob;
			this.position = position;
			
		}
		/**
		 * String represents football player informations.
		 */
		@Override
		public String toString() {
			String s= "";
			s += "Name" + name + "\n";
			s += "Year of Birth" + yob + "\n";
			s += "Position in Team" + position ;
			return s;
		}
		
	}


