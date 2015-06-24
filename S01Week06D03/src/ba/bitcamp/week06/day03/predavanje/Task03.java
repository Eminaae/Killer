package ba.bitcamp.week06.day03.predavanje;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task03 extends JFrame {
	
	private static final int ITALIC = 0;
	private static final int BOLD = 0;
	private JLabel label = new JLabel("Press one to disable other...");
	private JButton button1 = new JButton ("Button 1");
	private JButton button2 = new JButton ("Button 2");
	int counter = 0;
	
	//CONSTRUCTOR
	public Task03(){
				
		setLayout(new BorderLayout());
		add(label,BorderLayout.CENTER);
		add(button1,BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
	
		setSize(400,300);
		setTitle("Task 3");
		setVisible(true);
		setLocationRelativeTo(null);
		label.setHorizontalAlignment(JLabel.CENTER);	
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		
		
	}
	
	private class Action implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {	
			
			if(e.getSource() == button1){
				button1.setEnabled(false);
				button2.setEnabled(true);
				counter ++;
			}else if(e.getSource() == button2){
				button2.setEnabled(false);
				button1.setEnabled(true);
				counter ++;
			}if (counter == 5)
				System.exit(0);
			}
		}
		
	public static void main(String[] args) {
		new Task03();
	}

}
