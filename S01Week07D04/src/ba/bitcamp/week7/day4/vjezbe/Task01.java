package ba.bitcamp.week7.day4.vjezbe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task01 extends JFrame{
	private JFrame window = new JFrame();
	
	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel label1 = new JLabel("Label1");
	private JLabel label2 = new JLabel("Label2");
	private JTextArea text = new JTextArea();
	
	public Task01(){
		setLayout(new GridLayout(1,2));
		add(panel1);
		add(panel2);
	
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		panel2.setLayout(new GridLayout(3,3));
		for (int i = 1; i < (3 * 3)+1; i++) {
			panel2.add(new JButton("Button" +i));
		}
		
		panel1.setLayout(new BorderLayout());
		panel1.add(label2, BorderLayout.SOUTH);
		panel1.add(text);
		panel1.add(label1, BorderLayout.NORTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setTitle("Layout Example");
		setVisible(true);

		
	}
	
	public static void main(String[] args) {
		new Task01();

	}

}
