package predavanjaS12D01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Search {

	private String fileName;
	private String exstension;
	private String searchTerm;

	private Queue<File> files;

	public Search(String searchString) {
		String[] parts = searchString.split(" ");
		if (parts.length < 2) {
			throw new IllegalArgumentException("Invalid search format.");
		}

		searchTerm = parts[0];

		String[] fileInfo = parts[1].split("\\.");
		if (fileInfo.length < 2) {
			throw new IllegalArgumentException("Invalid search format.");
		}

		fileName = fileInfo[0];
		exstension = fileInfo[1];

		// if file/name extension are * set them to empty string
		// to avoid filter errors
		if (fileName.equals("*")) {
			fileName = "";
		}
		if (exstension.equals("*")) {
			exstension = "";
		}

		files = new LinkedList<File>();
	}

	public void startSearch() {
		File root = new File(".");
		enqueueFiles(root);

		SerachThread[] st = new SerachThread[5];

		for (int i = 0; i < st.length; i++) {
			st[i] = new SerachThread();
			st[i].start();
		}

	}

	private synchronized void enqueueFiles(File root) {
		File[] files = root.listFiles(new Filter());
		for (int i = 0; i < files.length; i++) {
			this.files.add(files[i]);
		}
	}

	private class SerachThread extends Thread {

		@Override
		public void run() {
			while (true) {

				File f = null;

				synchronized (files) {
					if (files.isEmpty())
						return;
					f = files.remove();
				}

				if (f.isDirectory()) {
					enqueueFiles(f);
					continue; // nastavlja petlju ali preskace sve operacije
				}

				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					while (br.ready()) {
						String line = br.readLine();
						if (line.contains(searchTerm)) {
							System.out.println(f.getName() + ":" + line);
						}
					}

				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

			}
		}
	}

	/**
	 * Filter for files by name extension
	 * 
	 * @author kristina.pupavac
	 *
	 */
	private class Filter implements FileFilter {

		@Override
		public boolean accept(File pathname) {

			if (pathname.isDirectory()) {
				return true;
			}

			if (fileName.isEmpty() && exstension.isEmpty()) {
				return true;
			}

			String file = fileName + '.' + exstension;

			return pathname.getName().contains(file);

		}
	}

}
