package ba.bitcamp.week11.day5.exercises;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.server.UID;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Client extends JFrame {

	private JLabel[][] label;
	private JFrame frame;

	int x = 0;
	int y = 0;

	public Client() {
		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label = new JLabel[20][20];
		setTitle("Client");
		setLayout(new GridLayout(20, 20, 5, 5));
		addKeyListener(new KeyAction());

		for (int i = 0; i < label.length; i++) {
			for (int j = 0; j < label[i].length; j++) {
				label[i][j] = new JLabel();
				label[i][j].setBorder(BorderFactory.createLineBorder(Color.RED));
				label[i][j].setOpaque(true);
				label[i][j].setBackground(Color.WHITE);
				label[0][0].setBackground(Color.BLACK);
				add(label[i][j]);
			}
			System.out.println();
		}

		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public class KeyAction implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			try {
				if (e.getKeyCode() == e.VK_RIGHT && y < 19) {
					label[x][y].setBackground(Color.WHITE);
					y += 1;
					label[x][y].setBackground(Color.BLACK);
				}

				if (e.getKeyCode() == e.VK_LEFT && y > 0) {
					label[x][y].setBackground(Color.WHITE);
					y -= 1;
					label[x][y].setBackground(Color.BLACK);
				}

				if (e.getKeyCode() == e.VK_DOWN && x < 19) {
					label[x][y].setBackground(Color.WHITE);
					x += 1;
					label[x][y].setBackground(Color.BLACK);
				}

				if (e.getKeyCode() == e.VK_UP && x > 0) {
					label[x][y].setBackground(Color.WHITE);
					x -= 1;
					label[x][y].setBackground(Color.BLACK);
				}

			} catch (IndexOutOfBoundsException e1) {
				System.out.println("Out of bounds");
			}
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}
