package predavanjaS11D04;

public class Main2 {

	public static void main(String[] args) {
		NamedRunnable r1 = new NamedRunnable("Ross");
		NamedRunnable r2 = new NamedRunnable("Joey");
		NamedRunnable r3 = new NamedRunnable("Chandler");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

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
