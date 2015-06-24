package ba.bitcamp.week06.day03.predavanje;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task02 extends JFrame{

	private JLabel label = new JLabel("Choose one");
	private JButton button = new JButton ("Exit");
	private JButton button1 = new JButton ("Do not exit");
	
	public Task02(){
		
		label.setHorizontalAlignment(JLabel.LEFT);
		button.addActionListener(new Action());
		button1.addActionListener(new Action());
	
		setLayout(new BorderLayout());
		add(label, BorderLayout.WEST);
		add(button, BorderLayout.SOUTH);
		add(button1, BorderLayout.NORTH);
		
		setSize(400, 300);
		setTitle("Task 2");
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button){
				System.exit(0);
			}else if (e.getSource() == button1){
				label.setText("It did not exit");
			}
				
		}
	}
	
	public static void main(String[] args) {
		new Task02();
	}

}
