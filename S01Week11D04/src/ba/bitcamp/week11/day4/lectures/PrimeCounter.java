package ba.bitcamp.week11.day4.lectures;

import java.util.Date;

public class PrimeCounter extends Thread {

	private static Object o = new Object();
	private int start;
	private int end;
	private static int count;
	

	public PrimeCounter(int start, int end) {
		this.start = start;
		this.end = end;
		this.count = 0;
	}

	@Override
	public void run() {
		countPrimes();
	}

	public void countPrimes() {
		for (int i = 0; i < end; i++) {
			if (isPrime(i)){
				synchronized(o){
					count++;
				}
			}		
		}
	}

	private boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}

	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		Date start = new Date();
		PrimeCounter[] counters = new PrimeCounter[1000];
		int startInterval = 1;
		int endInterval = 1000000;
		int step = endInterval / counters.length;
		for (int i = 0; i < counters.length; i++) {
			counters[i] = new PrimeCounter(i * step, (i + 1) * step);
			counters[i].start();
		}

		int totalCount = 0;
		for (int i = 0; i < counters.length; i++) {
			try {
				counters[i].join();
				totalCount += counters[i].getCount();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println();
			Date end = new Date();
			long timeLapse = (end.getTime() - start.getTime()) / 1000;
			System.out.println("Times: " + timeLapse);
			System.out.println("End of main");
		}
	}
}
