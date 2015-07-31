package ba.bitcamp.week07.day03.vjezbe;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Example4 extends JFrame {
	private static final long serialVersionUID = 6677794323364327745L;

	private JPasswordField pass = new JPasswordField();
	
	public Example4() {
		add(pass);
		
		pass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String correctPassword = "1234";
				String givenPassword = String.valueOf(pass.getPassword());
				System.out.println(pass.getPassword());
				
				if (correctPassword.equals(givenPassword)) {
					JOptionPane.showMessageDialog(null, "Correct");
				} else {
					JOptionPane.showMessageDialog(null, "Not correct");
				}
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JPasswordField example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Example4();
	}

}