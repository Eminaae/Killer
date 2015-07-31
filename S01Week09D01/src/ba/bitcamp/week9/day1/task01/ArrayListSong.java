package ba.bitcamp.week9.day1.task01;

import java.util.Arrays;

public class ArrayListSong {
	
	Song[] songs = new Song[0];
	private int counter;

	/**
	 * An empty constructor
	 * @param songs
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
	 * Gets method for given index returns element on that index
	 * @return
	 */

	public int getSongs(int index) {
		if(index < 0){
			throw new ArrayIndexOutOfBoundsException("Illegal index");
		}
		return index;
	}

	/**
	 * Adds one song to the list
	 * @param songs
	 */
	public void addSong(Song song) {
		Song[] tempArray = new Song[songs.length + 1];
		//if(songs.length == 0)
		for (int i = 0; i < songs.length; i++) {
			tempArray[i] = songs[i];
		}
		
		tempArray[songs.length] = song;
		
		songs = tempArray;
	}
	
	/**
	 * Removes songs from the list
	 * @return tempSongs
	 */
	public void remove(int index) {
		Song[] tempSong = new Song[songs.length - 1];
		
		for (int i = 0; i < index; i++) {
			tempSong[i] = songs[i];
		}
		
		for (int i = index + 1; i < songs.length; i++) {
			tempSong[i - 1] = songs[i];
		}
		
		songs = tempSong;
	}
	
	/**
	 * Returns list size
	 * @param list
	 * @return
	 */
	public int size(ArrayListSong list){
		return this.songs.length;
	}
	
	/**
	 * Returns index of song that first time shows up in an array, if song
	 * doesn't exist returns -1
	 * @param index
	 * @return
	 */
	public Song getIndex(int index){
		return songs[index];
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ArrayListSong)) {
			return false;
		}
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs)) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "songs: " + Arrays.toString(songs);
	}
	
}
