package ba.bitcamp.week9.day1.task01;

public class Main {

	public static void main(String[] args) {
		ArrayListSong list = new ArrayListSong();
		Song s1 = new Song("Hero", "Madona", 1999);
		Song s2 =new Song("Far Away", "NB", 1980);
		Song s3 =new Song("Song3", "Author3", 1981);
		Song s4 =new Song("Song4", "Author4", 1988);
		list.addSong(s1);
		list.addSong(s2);
		list.addSong(s3);
		list.addSong(s4);
		//list.remove(0);
		
		System.out.println(list + "    ");
		System.out.println(list.getIndex(2));
		System.out.println(list.size(list));

	}

}
