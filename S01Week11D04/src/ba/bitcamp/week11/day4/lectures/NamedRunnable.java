package ba.bitcamp.week11.day4.lectures;

public class NamedRunnable implements Runnable{

	private String name;
	public NamedRunnable(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		NamedRunnable r1 = new NamedRunnable("xxxx");
		NamedRunnable r2 = new NamedRunnable("oooo");
		NamedRunnable r3 = new NamedRunnable("llll");
		
		//upakujemo runnable u thread-ove
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.
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
		
	//	System.out.println("End of main");
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println("End of main");
		}
		
	}

}
