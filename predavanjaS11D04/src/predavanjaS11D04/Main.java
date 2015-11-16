package predavanjaS11D04;

public class Main implements Runnable{

	public static void main(String[] args) {
		Main m = new Main ();
		Thread t = new Thread(m);
		t.start();
			
		for (int i = 0; i < 100; i++) {
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
		};
		System.out.println("Wake up!");
	}

}
