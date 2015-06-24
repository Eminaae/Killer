
public abstract class Network {
	public String name;
	public Computer c;
	
	
	public Network(String name, char[] c){
		int counter = 0;
		this.name = name;
		this.c = new Computers();
		char[] arr = { '1', 'q', '2', '3', '4', '5'};

	}
	
	public abstract void addComputer(Computer c);
	public abstract void removeComputer(Computer c);
}
