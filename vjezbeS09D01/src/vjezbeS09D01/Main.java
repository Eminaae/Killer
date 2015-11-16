package vjezbeS09D01;

public class Main {

	public static void main(String[] args) {
		Song s1 = new Song ("P1", "A1" , 1986, Song.ROCK);
		Song s2 = new Song ("P2", "A1" , 2000, Song.ROCK);
		Song s3 = new Song ("P3", "A2" , 2011, Song.ROCK);
		Song s4 = new Song ("P4", "A3" , 1999, Song.POP);
		Song s5 = new Song ("P5", "A3" , 1985, Song.POP);
		Song s6 = new Song ("P6", "A4" , 2014, Song.RNB);
		
	/*	ArrayListSong songs = new ArrayListSong();
		
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		
		System.out.println(songs);
		
		System.out.println(songs.indexOf(s3));
		System.out.println(songs.size());
		System.out.println(songs.getSong(1));
		
		songs.remove(2);
		songs.remove(s3);
		System.out.println(songs);
		*/
		
		LinkedListSong list = new LinkedListSong();
		System.out.println(list);
		
		list.add(s1);
		list.add(s3);
		list.add(s5);
		list.add(s4);
		System.out.println(list.get(1));
		
		System.out.println(list);
		
		list.remove(2);
		list.remove(1);
	
		System.out.println(list);
	    list.remove(s1);
	    System.out.println(list);
	   
		
	    System.out.println(list.size());
	    
	    System.out.println(list.indexOf(s4));
	    list.clear();
	    
	    System.out.println(list);
		
	}

}
