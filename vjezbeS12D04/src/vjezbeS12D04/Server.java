package vjezbeS12D04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	private static Integer primeCounter = 0;
	private static ArrayList<Worker> list;
	private static Object lock = new Object();

	// 0 - 1.000.000
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			System.out.println("Server started.");

			BigInteger a = new BigInteger("0");
			BigInteger b = new BigInteger("2000000");
			BigInteger workLoad = new BigInteger("2000000");
			BigInteger big = new BigInteger("31176236472038964811");

			list = new ArrayList<>();
			long t = System.currentTimeMillis();
			while (b.compareTo(big) < 0) {
				Socket client = server.accept();
				System.out.println("Got client!");

				String ip = client.getInetAddress().getHostAddress().toString();
				System.out.printf("%s got (%d, %d)\n", ip, a, b);

				Worker w = new Worker(client, a, b, big);
				list.add(w);
				//
				// if (b.compareTo(num1) > 0) {
				// workLoad.add(num);
				// }

				a = a.add(workLoad);
				b = b.add(workLoad);
			}

			// int tempCounter = 0;
			// for (Worker w : list) {
			// try {
			// if (w != null) {
			// w.join();
			// tempCounter += w.result;
			// }
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			//
			// server.close();
			// System.out.println("Total time: " + (System.currentTimeMillis() -
			// t) + " [ms]");
			// System.out.println("a: " + a);
			// System.out.println("b: " + b);
			// System.out.println();
			// System.out.println("Primes: " + primeCounter);
			// System.out.println("Primes: " + tempCounter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class Worker extends Thread {
		private Socket socket;
		private BigInteger a;
		private BigInteger b;
		private BigInteger big;

		public Worker(Socket socket, BigInteger a, BigInteger b, BigInteger big) {
			this.socket = socket;
			this.a = a;
			this.b = b;
			this.big = big;
			this.start();
		}

		@Override
		public void run() {
			try {
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream()));

				writer.write(a + " " + b + " " + big);
				writer.newLine();
				writer.flush();

				// long t = System.currentTimeMillis();
				//
				// BufferedReader reader = new BufferedReader(new
				// InputStreamReader(socket.getInputStream()));
				//
				// String msg = reader.readLine();
				//
				// String ip =
				// socket.getInetAddress().getHostAddress().toString();
				// try {
				// long time = System.currentTimeMillis() - t;
				// System.out.println(ip + ": " + msg + " Time: " + time +
				// " [ms]");
				// result += Integer.parseInt(msg);
				// synchronized (lock) {
				// primeCounter += Integer.parseInt(msg);
				// }
				// } catch (NumberFormatException ex) {
				// System.err.println(ip + " napusta kucu velikog BitCampa.");
				// }
				//
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}
}
