package vjezbeS12D02;

public class TwoThreads {
	public static Integer counter = 0;
	private static Thread t1;
	private static Thread t2;

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			threadRunner();
		}
	}

	public static class MyThread implements Runnable {

		@Override
		public void run() {

			synchronized (counter) {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			for (int i = 0; i < 100; i++) {
				counter += 10;
			}
		}

	}

	public static void threadRunner() {
		t1 = new Thread(new MyThread());
		t1.start();

		t2 = new Thread(new MyThread());
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(counter);

		counter = 0;

	}

}
