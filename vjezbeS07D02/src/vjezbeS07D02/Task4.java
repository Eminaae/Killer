package vjezbeS07D02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Task4 extends JFrame {
	private static final long serialVersionUID = -7118502896426429708L;
	private JLabel label = new JLabel("Get ready. . .");
	int t1;
	boolean isReady = false;

	public Task4() {

		// label.addActionListener(new Action());
		add(label);
		Timer t = new Timer((int) (Math.random() * 2000 + 2000), new Action());
		t.start();

		label.setHorizontalAlignment(NORMAL);
		setTitle("KeyListener example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Press key now!");
			t1 = (int) System.currentTimeMillis();
			isReady = true;
			addKeyListener(new Key());

		}

	}

	public class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				int t2 = (int) System.currentTimeMillis();
				int t3 = t2 - t1;
				if (isReady) {
					label.setText("Good job! Youre score is: " + t3 + " ms");
				} else {
					label.setText("To early!");
				}

			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new Task4();

	}

}
