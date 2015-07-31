package ba.bitcamp.week07.day03.predavanja;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		int fullWidth = 400, fullHeight = 600;
		JFrame window = new JFrame();
		window.setSize(400, 600);

		// labels
		JPanel container = new JPanel();
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setForeground(Color.BLUE);
		nameLabel.setFont(new Font("Serif", Font.ITALIC, 13));

		JLabel emailLabel = new JLabel("Email");

		// text fields
		JTextField nameField = new JTextField(30); // means 20 characters will
													// be visible
		JTextField emailField = new JTextField(30);

		JTextArea terms = new JTextArea(10, 30);
		terms.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		terms.setLineWrap(true);
		terms.setEditable(false);// will not allow user to change text

		// button
		JButton submit = new JButton("Submit");
		// submit.setEnabled(true); // button is disabled until user click
		// checkbox

		JCheckBox cb = new JCheckBox("I accept terms and conditions");
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cb.isSelected()) {
					String name = nameField.getText();
					String email = emailField.getText();
					//submit.setEnabled(false);
					System.out.println("Name: " + name + "Email: " + email);
				} else {
					JOptionPane error = new JOptionPane(
							"You have to accept terms and conditions",
							JOptionPane.ERROR_MESSAGE);
					error.createDialog(window, "HAHA").setVisible(true);
					nameField.setText("");
					emailField.setText("");
				}
			}
		});

		// checkbox
		cb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JCheckBox cb = (JCheckBox) e.getSource();
				submit.setEnabled(cb.isSelected()); // button is active if
													// checkbox is selected

			}
		});

		container.add(nameLabel);
		container.add(nameField);
		container.add(emailLabel);
		container.add(emailField);
		container.add(terms);
		container.add(cb);
		container.add(submit);
		window.add(container);

		window.setSize(fullWidth, fullHeight);
		window.setVisible(true);

	}

}
