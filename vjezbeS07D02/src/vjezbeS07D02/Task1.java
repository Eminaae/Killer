package vjezbeS07D02;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame {
	private static final long serialVersionUID = -3145104105044056245L;
	private JLabel label = new JLabel();

	public Task1() {
		add(label);
		label.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		label.setHorizontalAlignment(JLabel.CENTER);

		addFocusListener(new Focus());

		setTitle("Task1");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Focus implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			label.setText("In focus.");
		}

		@Override
		public void focusLost(FocusEvent e) {
			label.setText("Not in focus.");
		}

	}

	public static void main(String[] args) {
		new Task1();

	}

}
