package vjezbeS06D05;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task1 extends JFrame {
	private static final long serialVersionUID = 1527171343873514033L;

	private JButton[] buttons = new JButton[9];
	private String[] textOnButtons = { "1", "2", "3", "4", "5", "6", "7", "8",
			"9" };
	private int sum = 0;
	private int counter = 0;


	public Task1() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(textOnButtons[i]);
			buttons[i].addActionListener(new Action());
			add(buttons[i]);
		}

		setLayout(new GridLayout(3, 3, 10, 10));

		setTitle("Dugmici");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task1();
	}

	class Action implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (counter < 2) {
				for (int i = 0; i < buttons.length; i++) {
					if (e.getSource() == buttons[i]) {
						sum += Integer.parseInt(textOnButtons[i]);
					}
				}
				counter++;
				if (counter == 2) {
					JOptionPane.showMessageDialog(null, sum);
					sum = 0;
					counter = 0;
				}
			}
		}
	}

}
