package predavanjaS12D04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class CahtServer {

	private static LinkedBlockingQueue<Client> clients;
	private static LinkedBlockingQueue<Message> messages;
	private static ExecutorService pool = Executors.newFixedThreadPool(8);

	public static void main(String[] args) {
		clients = new LinkedBlockingQueue<Client>();
		messages = new LinkedBlockingQueue<Message>();

		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
	

		pool.submit(new Sender());
		pool.submit(new Sender());
		pool.submit(new Sender());

		try {
			ServerSocket server = new ServerSocket(6815);
			Socket client;

			while (true) {
				client = server.accept();
				clients.add(new Client(client));

				new Thread(new Listener()).start();
				new Thread(new Sender()).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static class Listener implements Runnable {

		@Override
		public void run() {
			Client c = null;
			try {
				c = clients.take();
				clients.add(c);

				BufferedReader reader = c.getReader();
				StringBuilder st = new StringBuilder();

				while (reader.ready()) {
					st.append(reader.readLine());
					Message message = new Message(c.getId(), st.toString());
					Iterator<Client> it = clients.iterator();

					while (it.hasNext()) {
						it.next().addMessage(message);
					}

				}

			} catch (InterruptedException | IOException e) {
				clients.remove();
				e.printStackTrace();
			}
			pool.execute(this);
		}

	}

	private static class Sender implements Runnable {

		@Override
		public void run() {
			try {
				Client c = clients.take();
				clients.add(c);
				c.sendMessages();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pool.execute(this);
		}
	}
}
