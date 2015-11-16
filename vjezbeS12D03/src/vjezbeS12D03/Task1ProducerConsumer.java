package vjezbeS12D03;

import java.util.concurrent.LinkedBlockingQueue;

public class Task1ProducerConsumer {
	public static Integer counter = 0;
	public static LinkedBlockingQueue<Runnable> queue;

	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<>();

		long t1 = System.currentTimeMillis();
		
		queue.add(new Task(10, 250000));
		queue.add(new Task(250001, 500000));
		queue.add(new Task(500001, 750000));
		queue.add(new Task(750001, 1000000));
		

		for (int i = 0; i < 4; i++) {
			Slave s = new Slave();
			s.run();
		}
		System.out.println("Prime numbers: " + counter);
		System.out.println(System.currentTimeMillis() - t1 + " ms");
	}

	static class Slave implements Runnable {

		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Runnable job = queue.take();
					job.run();
				} catch (InterruptedException e) {
					break;
				}
			}

		}

	}

	static class Task implements Runnable {
		int start;
		int end;

		public Task(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			for (int i = start; i < end; i++) {
				if (isPrime(i)) {
					synchronized (counter) {
						counter++;
					}

				}
			}
			
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
