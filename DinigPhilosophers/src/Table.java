import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Table extends Thread{
	
	private static boolean gotoDeadLock =true;
	static class Stick {
		private boolean taken = false;
		private int index;

		public synchronized void take() throws InterruptedException {
			while (taken) {
				wait();
			}
			taken = true;
		}

		public synchronized boolean drop() {
			return taken = false;
		}

		public Stick() {

		}

//		public Stick(boolean taken, int index) {
//			this.taken = taken;
//			this.index = index;
//		}

		@Override
		public String toString() {
			return "Stick " + taken;
		}
	}

	static class Philosopher implements Runnable {
		private Stick left;
		private Stick right;
		private Random rand = new Random();
		public static int waiting = 0;
		private final int id;
		private final int ponderFactor;
		
		private void pause() throws InterruptedException {
	        if (ponderFactor == 0) {
	            return;
	        }
	        TimeUnit.MILLISECONDS.sleep(
	                rand.nextInt(ponderFactor * 250));
	    }

	    public Philosopher(Stick left, Stick right,
	            int ident, int ponder) {
	        this.left = left;
	        this.right = right;
	        id = ident;
	        ponderFactor = ponder;
	    }

	    public void run() {
	        try {
	            while (!Thread.interrupted()) {
	                System.out.println(this + " " + "thinking");
	                pause();
	                // Philosopher becomes hungry
	                System.out.println(this + " " + "grabbing right");
	                right.take();
	                System.out.println(this + " " + "grabbing left");
	                left.take();
	                System.out.println(this + " " + "eating");
	                pause();
	                right.drop();
	                left.drop();
	            }
	        } catch (InterruptedException e) {
	            System.out.println(this + " " + "exiting via interrupt");
	        }
	    }

	    public String toString() {
	        return "Philosopher " + id;
	    }

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		int ponder = 5;
        if (args.length > 0) {
            ponder = Integer.parseInt(args[0]);
        }
        int size = 5;
        if (args.length > 1) {
            size = Integer.parseInt(args[1]);
        }
        ExecutorService exec = Executors.newCachedThreadPool();
        Stick[] sticks = new Stick[size];
        for (int i = 0; i < size; i++) {
            sticks[i] = new Stick();
        }
        for (int i = 0; i < size; i++) {
            exec.execute(new Philosopher(
                    sticks[i], sticks[(i + 1) % size], i, ponder));
        }
        if (args.length == 3 && args[2].equals("timeout")) {
            TimeUnit.SECONDS.sleep(5);
        } else {
            System.out.println("Press 'Enter' to quit");
            System.in.read();
        }
        exec.shutdownNow();
    }
		

}
