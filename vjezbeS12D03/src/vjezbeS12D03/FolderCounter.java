package vjezbeS12D03;

import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;

public class FolderCounter {
	public static int counterFile = 0;
	public static int counterDirectory = 0;
	public static LinkedBlockingQueue<Task> queue;

	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<>();
		File file = new File ("/");
		
		Task task = new Task(file);
		queue.add(task);
		
		long t = System.currentTimeMillis();
		Worker w = new Worker();
		w.start();
		
		try {
			w.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of files: " + counterFile);
		System.out.println("Number of directory: " + counterDirectory);
		
		System.out.println(System.currentTimeMillis() - t + " [ms]");
	}
	
	static class Task extends Thread {
		private File root;
		public Task (File root) {
			this.root = root;
		}
		@Override
		public void run () {
			if (root == null) {
				return;
			} else if (root.listFiles() == null) {
				return;
			}
			
			for (File f : root.listFiles()) {
				if (f.isFile() && !f.isHidden()) {
					counterFile++;
				} else if (f.isDirectory() && !f.isHidden()) {
					counterDirectory++;
					
					queue.add(new Task(f));
				}
			}
		}
	}
	
	static class Worker extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Task t = queue.take();
					t.run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}
