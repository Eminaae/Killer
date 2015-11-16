package vjezbeS07D04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Example1 extends JFrame {
	private static final long serialVersionUID = 3848456676901260987L;

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	
	public Example1() {
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		for (int i = 0; i < 10; i++) {
			JLabel l = new JLabel("(Ajla " + i + ")");
			if (i != 9) {
				l.setText(l.getText() + ", ");
			}
			l.setForeground(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
			
			l.setFont(new Font("Serif", Font.PLAIN, 80));
			panel1.add(l);
		}
		
		panel2.setLayout(new GridLayout(6, 6));
		for (int i = 0; i < 6 * 6; i++) {
			panel2.add(new JButton(i + ""));
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Layout Example");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Example1();
	}

}