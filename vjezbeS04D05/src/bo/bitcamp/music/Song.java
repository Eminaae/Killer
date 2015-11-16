package bo.bitcamp.music;

public class Song {
	Performer performer;
	String songName;
	int songYear;
    String songGenere;
    
    public String toString() {
		String s = "";
		s += "Older song is: " + songName + "\n";
		return s;
	}

}
