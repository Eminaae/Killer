package predavanjaS07D03;

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

public class Main extends JFrame {
	private static final long serialVersionUID = -5392429021429470519L;
	int fullWidth = 400;
	int fullHeigth = 600;
	// JFrame winodw = new JFrame ();
	JPanel container = new JPanel();
	JLabel nameLabel = new JLabel("Name");
	JLabel emailLabel = new JLabel("Email");
	JTextField nameField = new JTextField(30); // vidljivo zadnjih trideset
	JTextField emailField = new JTextField(30);
	JTextArea terms = new JTextArea(10, 30);
	JCheckBox cb = new JCheckBox("I accept the terms and conditions.");
	JButton submit = new JButton("Subimit");

	public Main() {
		add(container);
		container.add(nameLabel);
		container.add(nameField);
		container.add(emailLabel);
		container.add(emailField);
		container.add(terms);
		container.add(cb);
		container.add(submit);
		//submit.setEnabled(false);
		
//		cb.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JCheckBox cb = (JCheckBox) e.getSource();
//				submit.setEnabled(cb.isSelected());
//
//			}
//
//		});
		terms.setText("jhdjkfhkjf kjbjhbfj kbfkjgjkf kfhgjkhgjhjkfg khjf kdfhjfd kljfsksfg jhfsd kjfhjgf");
		terms.setLineWrap(true);
		terms.setEditable(false); // ne moze niko da mijenja input
		
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cb.isSelected()){ 
				String name = nameField.getText();
				String email = emailField.getText();
				System.out.println("Name: " + name + " Email: " + email);
				} else {
					JOptionPane error = new JOptionPane("You have to accepted terms and contidtions", JOptionPane.ERROR_MESSAGE);
					error.createDialog("Ha Ha").setVisible(true);
					nameField.setText("");
					emailField.setText("");
				}
			}
			
		});

		nameLabel.setForeground(Color.BLUE);
		nameLabel.setFont(new Font("Serif", Font.ITALIC, 20));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Basic components");
		setSize(fullWidth, fullHeigth);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Main();

	}

}
