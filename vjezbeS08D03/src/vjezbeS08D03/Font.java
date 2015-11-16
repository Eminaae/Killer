package vjezbeS08D03;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Font extends JFrame{
	private static final long serialVersionUID = 1544620708133282958L;
	
	private JPanel panel = new JPanel ();
	private JLabel[][] label = new JLabel[20][20];
	
	public Font () {
		
		
		add(panel);
		panel.setLayout(new GridLayout(20, 20));
		for (int i = 0; i < label.length; i++) {
			for (int j = 0; j < label[i].length; j++) {
				panel.add(label[i][j]);
			}
		}
		
		
		
		
		setSize(500, 500);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
