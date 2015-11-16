package vjezbeS07D04;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task1 extends JFrame{
	private static final long serialVersionUID = -6386366147005162599L;
	private JPanel panel1 = new JPanel ();
	private JPanel panel2 = new JPanel ();
	private JLabel label1 = new JLabel ("Label1");
	private JLabel label2 = new JLabel ("Label2");
	private JTextArea field = new JTextArea("Text Area");
	
	public Task1() {
		
		
		
		setLayout(new GridLayout(0,2));
		add(panel1);
		add(panel2);
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		panel2.setLayout(new GridLayout(3, 3));
		for (int i = 1; i <= 9; i++) {
			panel2.add(new JButton("Button " +i));
		}
		panel1.setLayout(new BorderLayout());
		panel1.add(label2, BorderLayout.NORTH);
	    panel1.add(field, BorderLayout.CENTER);
		panel1.add(label1, BorderLayout.SOUTH);
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setTitle("Frame1");
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Task1();

	}

}
