package vjezbeS07D03;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task3 extends JFrame {
	private static final long serialVersionUID = -8801090168494477299L;
	private JPanel panel = new JPanel();
	private JLabel name = new JLabel("Username: ");
	private JLabel pass = new JLabel("Password: ");
	private JTextField nameText = new JTextField();
	private JPasswordField passText = new JPasswordField();

	public Task3() {
		add(panel);
		panel.add(name, BorderLayout.WEST);
		panel.add(nameText);
		panel.add(pass, BorderLayout.WEST);
		panel.add(passText);
		panel.setLayout(new GridLayout(2, 0, 2, 2));

		passText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String pass1 = String.valueOf(passText.getPassword());
				if (e.getSource() == passText) {
					if (nameText.getText().equals("Mujo")
							&& pass1.equals("1234")) {
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(null,
								"Wrong password or username!");
					}
				}

			}

		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Login");
		setSize(400, 100);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task3();

	}

}
