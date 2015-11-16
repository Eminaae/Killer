package vjezbeS12D02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundCalculations extends JFrame {
	private static final long serialVersionUID = 2676935504616375418L;
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JButton start = new JButton("START");
	private Thread t;
	Integer counter = 0;

	public BackgroundCalculations() {
		add(panel);
		panel.setLayout(new GridLayout(2, 1, 15, 15));
		panel.add(label);
		panel.add(start);
		start.addActionListener(new ButtonHandler());

		setTitle("Background Calculation");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BackgroundCalculations();

	}

	public class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(start)) {
				t = new Thread(new MyThread());
				t.start();

			}
		}
	}

	private boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}

	public class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 10; i < 10000000; i++) {
				if (isPrime(i)) {
					synchronized (counter) {
						counter++;
					}

				}
			}
			label.setText("Number of prime numbers between 10 and 10 000 is: "
					+ counter);
			counter = 0;

		}
	}
}
