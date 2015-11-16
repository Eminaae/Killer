package vjezbeS07D03;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Example1 extends JFrame {
	private static final long serialVersionUID = 3848456676901260987L;

	private JTextArea field = new JTextArea();
	private JScrollPane pane = new JScrollPane(field);
	
	public Example1() {
		add(pane);
		field.setFont(new Font("Serif", Font.BOLD, 20));
		field.setToolTipText("Primjer tooltipa");
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextField example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Example1();
	}

}