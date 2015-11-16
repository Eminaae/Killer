package vjezbeS09D01;

import java.util.Arrays;

public class ArrayListSong {
	private Song[] songs;

	/**
	 * Constructor empty songs list
	 */
	public ArrayListSong() {
		songs = new Song[0];
	}

	/**
	 * @param songs
	 */
	public ArrayListSong(Song[] songs) {
		super();
		this.songs = songs;
	}

	/**
	 * 
	 * @param index
	 * @return
	 */
	public Song getSong(int index) {
		return songs[index];
	}
	
	
	/**
	 * @return the songs
	 */
	public Song[] getSongs() {
		return songs;
	}

	/**
	 * @param songs the songs to set
	 */
	public void setSongs(Song[] songs) {
		this.songs = songs;
	}

	/**
	 * 
	 * @param song
	 */
	public void add(Song song) {
		Song[] tempArray = new Song[songs.length + 1];

		for (int i = 0; i < songs.length; i++) {
			tempArray[i] = songs[i];
		}

		tempArray[songs.length] = song;

		songs = tempArray;
	}

	/**
	 * 
	 * @param index
	 */
	public void remove(int index) {
		Song[] tempArray = new Song[songs.length - 1];

		for (int i = 0; i < index; i++) {
			tempArray[i] = songs[i];
		}

		for (int i = index + 1; i < songs.length; i++) {
			tempArray[i - 1] = songs[i];
		}

		songs = tempArray;
	}
	
	/**
	 * 
	 * @param song
	 */
	public void remove (Song song) {
		for (int i = 0; i < songs.length; i++) {
			if (song.equals(songs[i])) {
				remove(i);
			} 
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int size () {
		return songs.length;
	}
	
	/**
	 * 
	 * @param song
	 * @return
	 */
	public int indexOf(Song song) {
		for (int i = 0; i < songs.length; i++) {
			if (song.equals(songs[i])) {
			   return i;
			} 
		}
		return -1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArrayListSong songs: " + Arrays.toString(songs) + "";
	}

}
