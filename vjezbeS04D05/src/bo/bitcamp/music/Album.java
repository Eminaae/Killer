package bo.bitcamp.music;

public class Album {
	String name;
	Performer performer;
	Song[] song; 
	String genere;
	
	public Album(String name, Performer performer, Song[] song, String genere) {
		super();
		this.name = name;
		this.performer = performer;
		this.song = song;
		this.genere = genere;
	}
}
