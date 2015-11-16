package vjezbeS07D03;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task4 extends JFrame {
	private static final long serialVersionUID = -7332008676949606551L;
	private int sum = 0;

	public Task4() {

		String number = JOptionPane.showInputDialog("Input number: ");
		if (number == null) {
			System.exit(0);
		}
		try {
			sum += Integer.parseInt(number);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid input!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		if (sum == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Sum is: " + sum);
		}
		int mess = JOptionPane.showConfirmDialog(null,
				"Do you want to enter more numbers? ");

		if (mess == JOptionPane.CANCEL_OPTION) {
			System.exit(0);
		}
		while (mess == JOptionPane.YES_OPTION) {
			number = JOptionPane.showInputDialog("Input number: ");
			if (number == null) {
				System.exit(0);
			}
			try {
				sum += Integer.parseInt(number);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid input!", null,
						JOptionPane.ERROR_MESSAGE);
			}
			mess = JOptionPane.showConfirmDialog(null,
					"Do you want to enter more numbers? ");
		}
		if (mess == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Sum is: " + sum);

		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sum");
		setSize(500, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task4();

	}

}
