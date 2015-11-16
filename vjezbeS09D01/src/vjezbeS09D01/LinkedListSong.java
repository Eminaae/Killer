package vjezbeS09D01;

public class LinkedListSong {
	private Node start;
	
	/**
	 * 
	 */
	public LinkedListSong() {
		start = null;
	}
	
	/**
	 * 
	 * @param songs
	 */
	public LinkedListSong(Song[] songs) {
		for (int i = 0; i < songs.length; i++) {
			add(songs[i]);
		}
	}
	
	/**
	 * 
	 * @param song
	 */
	public void add(Song song) {
		if (start == null) {
			start = new Node(song);
		} else {
			Node last = getLastNode();
			
			last.setNext(new Node(song));
		}
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Song get(int index) {
		Node temp = start;
		
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		
		return temp.getSong();
	}
	
	/**
	 * 
	 * @return
	 */
	private Node getLastNode() {
		if (start == null) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	/**
	 * 
	 * @param index
	 */
	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		
		Node previous = getPreviousNode(temp);
		
		previous.setNext(temp.getNext());
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	public void remove(Song song) {
	
		Node temp = start;
		for (int i = 0; i < indexOf(song); i++) {
			
			temp = temp.getNext();
			
		}
		
		Node previous = getPreviousNode(temp);
		
		previous.setNext(temp.getNext());
	}
	
	/**
	 * 
	 * @return
	 */
	public int size () {
		int counter = 1;
		if (start == null) {
			return 0;
		}
		Node temp = start;
		while (temp.getNext() != null) {
			counter++;
			temp = temp.getNext();
		}
		return counter;
	}
	
	/**
	 * 
	 */
	public void clear () {
		start = null;
	}
	
	/**
	 * 
	 * @param song
	 * @return
	 */
	public int indexOf(Song song) {
		int index = 0;
		if (start == null) {
			return 0;
		}
		Node temp = start;
		while (temp.getNext() != null) {
			index++;
			temp = temp.getNext();
		}
		return index;
	}

	/**
	 * 
	 * @author kristina.pupavac
	 *
	 */
	private class Node {
		private Song song;
		private Node next;

		public Node(Song song) {
			this.song = song;
		}

		/**
		 * @return the song
		 */
		public Song getSong() {
			return song;
		}

		/**
		 * @param song
		 *            the song to set
		 */
		public void setSong(Song song) {
			this.song = song;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			if (next == null) {
				return song + "";
			}

			return song + " " + next.toString();
		}
	}

	
	/* (non-Javadoc)
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
		LinkedListSong other = (LinkedListSong) obj;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}
		return start.toString();
	}
}
