package vjezbeS11D05;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Client extends JFrame {
	private static final long serialVersionUID = 1919503317724108064L;
	private JLabel[][] labels = new JLabel[10][10];
	private JPanel panel = new JPanel();
	private int x = 3;
	private int y = 3;

	private Socket socket;
	private BufferedWriter writer;

	public Client() {

		try {
			socket = new Socket("10.0.82.20", 9966);
			writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

		} catch (IOException e1) {
			e1.printStackTrace();
		}

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
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {	
				try {
				if (e.getKeyCode() == KeyEvent.VK_D) {

						
						writer.write("D");
						writer.newLine();
						writer.flush();
				

					if (x < labels.length - 1 && y >= 0
							&& y < labels.length - 1) {
						labels[x][y].setBorder(BorderFactory.createBevelBorder(
								DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
						y++;
						labels[x][y].setBorder(BorderFactory
								.createLineBorder(Color.RED));

					}

				} else if (e.getKeyCode() == KeyEvent.VK_S) {

			
						writer.write("S");
						writer.newLine();
						writer.flush();
				

					if (0 <= x && x < labels.length - 1
							&& y < labels.length - 1) {
						labels[x][y].setBorder(BorderFactory.createBevelBorder(
								DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
						x++;
						labels[x][y].setBorder(BorderFactory
								.createLineBorder(Color.RED));

					}

				} else if (e.getKeyCode() == KeyEvent.VK_A) {

					
						writer.write("A");
						writer.newLine();
						writer.flush();
				


					if (0 <= x && y >= 0 && y < labels.length - 1) {
						labels[x][y].setBorder(BorderFactory.createBevelBorder(
								DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
						y--;
						labels[x][y].setBorder(BorderFactory
								.createLineBorder(Color.RED));

					}

				} else if (e.getKeyCode() == KeyEvent.VK_W) {

					
						writer.write("W");
						writer.newLine();
						writer.flush();
					

					if (x >= 0 && x < labels.length - 1 && y >= 0) {
						labels[x][y].setBorder(BorderFactory.createBevelBorder(
								DO_NOTHING_ON_CLOSE, Color.BLACK, Color.CYAN));
						x--;
						labels[x][y].setBorder(BorderFactory
								.createLineBorder(Color.RED));

					}
				}
				
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
				
		});


		setSize(500, 500);
		setTitle("Moving square");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Client();

	}

}
