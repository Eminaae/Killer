package ba.bitcamp.week07.day02.vjezbe;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task01 extends JFrame{
	
	private JLabel label = new JLabel("Focused");
	
	public Task01(){
		add(label);
		label.setFont(new Font("Monotyped", Font.BOLD, 25));
		label.setHorizontalAlignment(JLabel.CENTER);
		addFocusListener(new Focus());
		
		setTitle("FOCUS!");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task01();
	}
	
	public class Focus implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			label.setText("Focused");

		}

		@Override
		public void focusLost(FocusEvent e) {
			label.setText("Lost");

		}

	}

}
