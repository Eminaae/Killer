package predavanjaS12D04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {

	private Socket client;
	private String id;
	BufferedReader reader;
	BufferedWriter writer;
	LinkedBlockingQueue<Message> messages;

	public Client(Socket client) {
		this.client = client;
		id = client.getInetAddress().getHostAddress();
		try {
			reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			messages = new LinkedBlockingQueue<Message>();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the reader
	 */
	public BufferedReader getReader() {
		return reader;
	}

	/**
	 * @return the writer
	 */
	public BufferedWriter getWriter() {
		return writer;
	}

	/**
	 * Closing socket client
	 */
	public void close() {
		try {
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addMessage(Message message) {
		messages.add(message);
	}

	public void sendMessages() {
		Iterator<Message> it = messages.iterator();

		try {
			while (it.hasNext()) {
				writer.write(it.next().getMessage());
			}
			writer.flush();
		} catch (IOException e) {
			messages.clear();
			e.printStackTrace();
		}
	}
}
