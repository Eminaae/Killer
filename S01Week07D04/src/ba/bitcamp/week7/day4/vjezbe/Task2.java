package ba.bitcamp.week7.day4.vjezbe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task2 extends JFrame{
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel label1 = new JLabel("Label1");
	private JLabel label11 = new JLabel("Label1");
	
	private JLabel label2 = new JLabel("Label2");
	private JLabel label3 = new JLabel("Label3");
	private JLabel label4 = new JLabel("Label4");
	private JButton button1 = new JButton("Button1");
	private JButton button2 = new JButton("Button2");
	private JButton button3 = new JButton("Button3");
	private JButton button4 = new JButton("Button4");
	private JButton button11 = new JButton("Button1");
	
	public Task2() {
	
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		panel1.setBorder(BorderFactory.createTitledBorder("Center panel"));
		panel2.setBorder(BorderFactory.createTitledBorder("South panel"));
		panel1.setLayout(new GridLayout(4,2));
		panel1.add(label1);
		panel1.add(button1);
		panel1.add(label2);
		panel1.add(button2);
		panel1.add(label3);
		panel1.add(button3);
		panel1.add(label4);
		panel1.add(button4);
		
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel2.add(label11);
		panel2.add(button11);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setTitle("Layout Example");
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Task2();
	}

}
