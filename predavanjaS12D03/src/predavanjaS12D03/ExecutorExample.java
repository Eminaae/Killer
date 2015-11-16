package predavanjaS12D03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void runExemple() {
		ExecutorService es = Executors.newFixedThreadPool(5);

		es.submit(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Prvi task");
			}

		});

		es.submit(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Drugi task");
			}

		});

		es.shutdown();
	}

}
