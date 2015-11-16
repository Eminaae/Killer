package vjezbeS07D03;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task2 extends JFrame {
	private static final long serialVersionUID = -1288327049866506644L;
	private JPanel panel = new JPanel();
	private JLabel text = new JLabel("Example");
	private JCheckBox c1 = new JCheckBox("BOLD");
	private JCheckBox c2 = new JCheckBox("ITALIC");
	private JButton button = new JButton("Applay");

	public Task2() {

		add(panel);
		panel.setLayout(new GridLayout(4, 10));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setFont(new Font("Serif", Font.PLAIN, 15));

		panel.add(text, BorderLayout.CENTER);
		panel.add(c1);
		panel.add(c2);
		panel.add(button, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (true != c1.isSelected() && true != c2.isSelected()) {
					text.setFont(new Font("Serif", Font.PLAIN, 15));
				} else if (e.getSource() == button && c1.isSelected()
						&& c2.isSelected()) {
					text.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 15));
				} else if (e.getSource() == button && c1.isSelected()) {
					text.setFont(new Font("Serif", Font.BOLD, 15));
				} else if (e.getSource() == button && c2.isSelected()) {
					text.setFont(new Font("Serif", Font.ITALIC, 15));
				}
			}

		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Task2");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task2();

	}

}
