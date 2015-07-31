import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Task01 extends JPanel {
	private static final long serialVersionUID = -7776624395055770439L;
	JButton buttons[] = new JButton[9];
	private String[] textOnButtons = { "1", "2", "3", "4", "5", "6", "7", "8",
			"9" };
	private int sum = 0;
	private int counter = 0;
	private boolean nextClick = true;

	
	public Task01() {
		setLayout(new GridLayout(3, 3));
		for (int i = 0; i <= 8; i++) {
			buttons[i] = new JButton(textOnButtons[i]);
			buttons[i] = new JButton(i+1+""); // i pretvara u string
			buttons[i].setFont(new Font("Cambria",Font.BOLD,30));
			buttons[i].addActionListener(new Action());
			add(buttons[i]);
		}
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().add(new Task01());
		window.setBounds(300, 300, 300, 300);
		window.setVisible(true);
	}

	class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (counter < 2) {
				for (int i = 0; i <= buttons.length; i++) {
					if (e.getSource() == buttons[i]) {
					if(nextClick)
						sum += Integer.parseInt(buttons[i].getText());
						JOptionPane.showMessageDialog(null, "Result is");
						nextClick = false;
						sum = 0;
					}else {
						sum += Integer.parseInt(buttons[i].getText());
						
				nextClick = true;
			}
		}
			}
		}
	}
}
	