package predavanjaS11D04;

public class NamedThread extends Thread{
	
	private String name;
	
	public NamedThread (String name) {
		this.name = name;
	}
	
	@Override
	public void run () {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " counted to: " + i);
		}
	}
}
