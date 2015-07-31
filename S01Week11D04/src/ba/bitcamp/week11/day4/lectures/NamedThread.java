package ba.bitcamp.week11.day4.lectures;

public class NamedThread extends Thread{
	private String name;
	public NamedThread(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " counted to " +i);
		}
	}

	public static void main(String[] args) {
		NamedThread t1 = new NamedThread("aaaa");
		NamedThread t2 = new NamedThread("bbbb");
		NamedThread t3 = new NamedThread("cccc");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("End of main");
	}
}
