package ba.bitcamp.week07.day03.vjezbe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Example2 extends JFrame {
	private static final long serialVersionUID = -1952365785711113226L;

	private JCheckBox box1 = new JCheckBox("Hello");
	private JCheckBox box2 = new JCheckBox("Merhaba");
	private JCheckBox box3 = new JCheckBox("Vozdra");
	
	public Example2() {
		setLayout(new GridLayout(3, 1, 5, 5));
		add(box1);
		add(box2);
		add(box3);
		
		box1.setSelected(true);
		box1.setEnabled(false);
		
		box2.addActionListener(new Action());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextField example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == box2) {
				box1.setEnabled(!box1.isEnabled());				
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Example2();
	}

}
