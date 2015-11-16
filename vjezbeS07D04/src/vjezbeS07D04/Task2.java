package vjezbeS07D04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task2 extends JFrame{
	private static final long serialVersionUID = 4034156981135582961L;
	private JPanel panel1 = new JPanel ();
	private JPanel panel2 = new JPanel ();
	private JLabel label = new JLabel ("Label 1");
	private JButton button = new JButton("Button 1");
	
	public Task2() {
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		panel1.setBorder(BorderFactory.createTitledBorder("Center panel"));
		panel2.setBorder(BorderFactory.createTitledBorder("South panel"));
		
		panel1.setLayout(new GridLayout(4, 2));
		for (int i = 1; i <= 4; i++) {
			panel1.add(new JLabel("Label " + i));
			panel1.add(new JButton("Button " + i));
		}
		
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.add(label);
		panel2.add(button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setTitle("Frame2");
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Task2();

	}

}
