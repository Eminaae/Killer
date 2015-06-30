package ba.bitcamp.week07.day02.vjezbe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Task04 extends JFrame {

	private static final long serialVersionUID = 7201967939272524900L;

	private JLabel label = new JLabel("Get ready");
	private long start;
	private long stop;
	Timer t = new Timer(1000, new Action());

	public Task04() {

		t.start();

		add(label);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setHorizontalAlignment(JLabel.CENTER);
		addKeyListener(new Key());
		setVisible(true);

	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyChar() == KeyEvent.VK_SPACE) {
				stop = System.currentTimeMillis() - start;
				label.setText(String.valueOf(stop));
				t.stop();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			start = System.currentTimeMillis();
			label.setText("Now press");
		}
	}

	public static void main(String[] args) {

		new Task04();
	}
}
