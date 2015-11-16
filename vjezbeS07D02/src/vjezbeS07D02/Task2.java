package vjezbeS07D02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {
	private static final long serialVersionUID = -957918177825415461L;
	private JLabel label = new JLabel();
	private String s = "";

	public Task2() {
		add(label);
		label.setHorizontalAlignment(NORMAL);
		addKeyListener(new Key());

		setTitle("Task1");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {

			if (e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
				s += e.getKeyChar();
				label.setText(s);
			} else {
				if (s.length() != 0) {
					s = s.substring(0, s.length() - 1);
					label.setText(s);
				}
			}

		}

	}

	public static void main(String[] args) {
		new Task2();

	}

}
