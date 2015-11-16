package predavanjaS12D03;

import java.util.concurrent.CountDownLatch;

public class LacthExample {

	private static CountDownLatch latch = new CountDownLatch(3);

	// pocece sa 3 i 3 puta treba ostvariti vrednost prije nego krene 2 tred

	public static void startExemple() {

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("The wainting thread can work");

			}

		}).start();

		latch.countDown();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
		latch.countDown();
	}
}
