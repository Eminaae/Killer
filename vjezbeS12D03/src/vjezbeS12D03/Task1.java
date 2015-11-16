package vjezbeS12D03;

public class Task1 {
	public static Integer counter = 0;
	public static Thread t;

	public static void main(String[] args) {
		t = new Thread(new MyThread());
		long t1 = System.currentTimeMillis();
		t.start();

		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - t1 + " ms");
	}

	public static class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 10; i < 1000000; i++) {
				if (isPrime(i)) {
					synchronized (counter) {
						counter++;
					}

				}
			}
			System.out.println("Prime numbers: " + counter);
		}

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++)
			if (number % i == 0) {
				return false;
			}
		return true;

	}

}
