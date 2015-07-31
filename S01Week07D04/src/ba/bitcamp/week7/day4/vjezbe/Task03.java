package ba.bitcamp.week7.day4.vjezbe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task03 extends JFrame{
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	
	private JLabel label1 = new JLabel("Label1");
	private JLabel label2 = new JLabel("Label2");
	private JLabel label3 = new JLabel("Label3");
	
	private JButton button1 = new JButton("Button1");
	private JButton button2 = new JButton("Button2");
	
	private JTextArea text = new JTextArea();
	
	public Task03(){
		
		setLayout(new GridLayout(1,2));
		add(panel1);
		add(panel2);
		
	
		panel1.setBorder(BorderFactory.createTitledBorder("Central panel"));
		panel2.setBorder(BorderFactory.createTitledBorder("East Panel"));
		
		panel1.setLayout(new BorderLayout());
		panel1.add(text);
		panel2.setLayout(new BorderLayout());
		panel2.add(panel3,BorderLayout.NORTH);
		panel3.setBorder(BorderFactory.createTitledBorder("Panel1"));
		
		panel3.setLayout(new GridLayout(3,2));
		panel3.add(label1);
		panel3.add(label2);
		panel3.add(label3);
		
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel4.add(button1);
		panel4.add(button2);
	
		
		
		
		
		panel2.add(panel4,BorderLayout.SOUTH);
		panel4.setBorder(BorderFactory.createTitledBorder("Panel2"));
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Layout Example");
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new Task03();
	}

}
