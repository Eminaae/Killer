package ba.bitcamp.week11.day4.lectures;

public class Main implements Runnable {

	public static void main(String[] args) {
		Main m = new Main();
		Thread t = new Thread(m);
		t.start();
		//neka operacija ceka dok thread zavrsi
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 150; i++) {
			System.out.println("Main");
		}
	}

	@Override
	public void run() {
		System.out.println("Going to sleep");
		try {
			
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 150; i++) {
			System.out.println("Thread");
		}
	}
}
