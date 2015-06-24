package ba.bitcamp.week4.structuretasks;

public class Main {

	public static void main(String[] args) {

		Artist a1 = new Artist("Three Doors Down", true, 1996, "rock");
		a1.name = "Three Doors Down";
		a1.isBand = true;
		a1.year = 1996;
		a1.ganr = "rock";

		Artist a2 = new Artist("Madonna", false, 1979, "pop");
		a2.name = "Madonna";
		a2.isBand = false;
		a2.year = 1979;
		a2.ganr = "pop";

		Artist a3 = new Artist("Nicleblack", false, 1995, "pop rock");
		a3.name = "Nicleblack";
		a3.isBand = false;
		a3.year = 1995;
		a3.ganr = "pop rock";

		System.out.println(a1.name + " " + a1.isBand + " " + a1.year + " " + a1.ganr);
		System.out.println(a2.name + " " + a2.isBand + " " + a2.year + " " + a2.ganr);
		System.out.println(a3.name + " " + a3.isBand + " " + a3.year + " " + a3.ganr);

		Song s1 = new Song(a1, " The better life ", 1998, "rock");
		Song s2 = new Song(a2, "Burning up", 1980, "pop");
		Song s3 = new Song(a3, "Far away", 1998, "pop rock");
		Song s4 = new Song(a2, "Best friend", 1999, "pop");
		
		System.out.println(s1.artist.name + " " + s1.songName + " " + s1.year + " " + s1.ganr);
		System.out.println(s2.artist.name + " " + s2.songName + " " + s2.year + " " + s2.ganr);
		System.out.println(s3.artist.name + " " + s3.songName + " " + s3.year + " " + s3.ganr);
		System.out.println(s2.artist.name + " " + s4.songName + " " + s4.year + " " + s4.ganr);
		
		
		System.out.println(isSameAuthor(s1,s2));
		System.out.println(isSameAuthor(s1,s3));
		System.out.println(isSoloAuthor(s3));
		System.out.println(getOlderSong(s1,s2));
	}

	public static boolean isSameAuthor(Song s2, Song s4) {
		if (s2.artist.name.equals(s2.artist.name)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isSoloAuthor(Song s2){
		boolean artist = true;
		if(s2.artist.isBand == true){
			artist = true;
			}else{
				artist = false;
			}
		return artist;
	}
	
	public static Song getOlderSong(Song s1, Song s2){
		if(s1.year > s2.year){
			return s2;
		}else{
		return s1;
		
		}
	}
}
