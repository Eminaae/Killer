package bo.bitcamp.music;


public class Main {
    /**
     * 
     * @param s1
     * @param s2
     * @return
     */
	public static boolean isSameAuthor(Song s1, Song s2) {
		if (s1.performer.name.equals(s2.performer.name)) {
	    return true;
		}
		return false;
	}
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isFromSoloAuthor(Song s) {
		if (s.performer.isGroup == true) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.songYear > s2.songYear) {
			return s2;
		}
		return s1;
	}
	/**
	 * 
	 * @param a - album
	 * @param genre - ganer
	 * @return counter - number of songs from album which are the same genere
	 */
	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;
		while (a.genere.equals(genre)) {
			counter++;
		}
		return counter;
	}
	public static void main(String[] args) {
		//First performer
		Performer p1 = new Performer();
		p1.name = "Eric Patrick Clapton";
		p1.isGroup = false;
		p1.since = 1962;
		p1.genere = "rock, blues rock, soft rock";
		
		Song s1p1 = new Song();
		s1p1.performer = p1;
		s1p1.songName = "Layla";
		s1p1.songYear = 1971;
		s1p1.songGenere = "bluse rock";
		
		Song s2p1 = new Song();
		s2p1.performer = p1;
		s2p1.songName = "Tears in Heaven";
		s2p1.songYear = 1992;
		s2p1.songGenere = "soft rock";
		
		//album
		String[] albumArrayp1 = new String[2];
		albumArrayp1[0] = s1p1.songName;
		albumArrayp1[1] = s2p1.songName;
		
		//Second performer
		Performer p2 = new Performer();
		p2.name = "Muse";
		p2.isGroup = true;
		p2.since = 1994;
		p2.genere = "alternative rock, progressive rock, hard rock, space rock";
		
		Song s1p2 = new Song();
		s1p2.performer = p2;
		s1p2.songName = "Histerya";
		s1p2.songYear = 2003;
		s1p2.songGenere = "alternative rock, new prog, hard rock";
		
		Song s2p2 = new Song();
		s2p2.performer = p2;
		s2p2.songName = "Undisclosed Desires";
		s2p2.songYear = 2009;
		s2p2.songGenere = "R&B, alternative dance, synthpop";
		
		//album
		String[] albumArrayp2 = new String[2];
		albumArrayp2[0] = s1p2.songName;
		albumArrayp2[1] = s2p2.songName;
		
		//Third performer
		Performer p3 = new Performer();
		p3.name = "Janis Joplin";
		p3.isGroup = false;
		p3.since = 1962;
		p3.genere = "blues rock, psychedelic soul, soul, country, jazz blues";
		
		Song s1p3 = new Song();
		s1p3.performer = p3;
		s1p3.songName = "Cry Baby";
		s1p3.songYear = 1963;
		s1p3.songGenere = "soul, blues";
		
		Song s2p3 = new Song();
		s2p3.performer = p3;
		s2p3.songName = "Mercedes benz";
		s2p3.songYear = 1971;
		s2p3.songGenere = "soul, blues";
		
		//album
				String[] albumArrayp3 = new String[2];
				albumArrayp1[0] = s1p3.songName;
				albumArrayp1[1] = s2p3.songName;
		
		//album 
		Album a1 = new Album ("Darker and dominos" , p1 , albumArrayp1  ,  "bluse rock" );
		Album a2 = new Album ("Hysteria" , p2, [s1p2, s2p2] , "alternative rock" );
		Album a3 = new Album ("Peral" , p3, [s1p3, s2p3] , "bluse rock" );
		
		
		//printing
		System.out.println(p1.name);
		System.out.println(isSameAuthor(s2p3, s1p3));
		System.out.println(isFromSoloAuthor(s2p1));
		System.out.println(getOlderSong(s1p1, s2p2));
		//System.out.println(countGenreNumber());
	}

}
