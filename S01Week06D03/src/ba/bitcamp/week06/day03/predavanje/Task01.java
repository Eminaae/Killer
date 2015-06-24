package ba.bitcamp.week06.day03.predavanje;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Task01 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2748658026041925732L;
	private JLabel label = new JLabel("Hello world!");
	private JButton button = new JButton("Hello");
	
	// CONSTRUCTOR
	public Task01() {
		label.setHorizontalTextPosition(JLabel.CENTER);
		button.addActionListener(new Action());
		setLayout(new BorderLayout());
		add(label,BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);	
		
		setLocationRelativeTo(null);
		setSize(400, 300);
		setTitle("Task 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				JOptionPane.showMessageDialog(null, "Hello");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new Task01(); //2.step napravi prozor
	}
}
