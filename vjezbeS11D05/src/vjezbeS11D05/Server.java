package vjezbeS11D05;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Server extends JFrame {
	private static final long serialVersionUID = 4851798548913691847L;

	private JLabel[][] labels = new JLabel[10][10];
	private JPanel panel = new JPanel();
	private int x = 3;
	private int y = 3;

	private ServerSocket server;
	private Socket client;
	private BufferedReader reader;
	String line;

	public Server() {

		add(panel);
		panel.setLayout(new GridLayout(10, 10, 3, 3));
		for (int i = 0; i < labels.length; i++) {
			for (int j = 0; j < labels[i].length; j++) {
				labels[i][j] = new JLabel(" ");
				labels[i][j].setBorder(BorderFactory.createBevelBorder(
						DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));

				panel.add(labels[i][j]);

			}
		}

		labels[x][y].setBorder(BorderFactory.createLineBorder(Color.RED));

		setSize(500, 500);
		setTitle("Moving square");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		try {
			server = new ServerSocket(9966);
			client = server.accept();
			reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			while (client.isConnected()) {
				line = reader.readLine();
			}
			System.out.println(line);

			if (line.equals("D")) {
				if (x < labels.length - 1 && y >= 0 && y < labels.length - 1) {
					labels[x][y].setBorder(BorderFactory.createBevelBorder(
							DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
					y++;
					labels[x][y].setBorder(BorderFactory
							.createLineBorder(Color.RED));

				}
			} else if (line.equals("A")) {

				if (0 <= x && y >= 0 && y < labels.length - 1) {
					labels[x][y].setBorder(BorderFactory.createBevelBorder(
							DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
					y--;
					labels[x][y].setBorder(BorderFactory
							.createLineBorder(Color.RED));

				}
			} else if (line.equals("S")) {
				
				if (0 <= x && x < labels.length - 1
						&& y < labels.length - 1) {
					labels[x][y].setBorder(BorderFactory.createBevelBorder(
							DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
					x++;
					labels[x][y].setBorder(BorderFactory
							.createLineBorder(Color.RED));

				}
				
			} else if (line.equals("W")) {
				if (x >= 0 && x < labels.length - 1 && y >= 0) {
					labels[x][y].setBorder(BorderFactory.createBevelBorder(
							DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
					x--;
					labels[x][y].setBorder(BorderFactory
							.createLineBorder(Color.RED));

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Server();

	}

}
