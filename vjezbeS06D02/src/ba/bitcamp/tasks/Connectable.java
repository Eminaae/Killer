package ba.bitcamp.tasks;

public interface Connectable {
	 public void connect(Computer computer);
	 public void connect(Network network);
	 public void disconnect();
}
