package ba.bitcamp.week07.day02.vjezbe;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task02 extends JFrame {

	private static final long serialVersionUID = 8490295648465221267L;
	private JLabel label = new JLabel();
	private String s = "";

	public Task02() {
		add(label);
		label.setFont(new Font("Monotyped", Font.ROMAN_BASELINE, 18));
		label.setHorizontalAlignment(JLabel.CENTER);
		setTitle("Typewriter");
		addKeyListener(new Key());

		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task02();
	}

	public class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && s.length() != 0) {
				s = s.substring(0, s.length() - 1);
				
				label.setText(s);
			} else {
				label.setText(s += e.getKeyChar());
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
