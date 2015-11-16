package predavanjaS07D04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Picker extends JPanel{
	private static final long serialVersionUID = -4865709664379631747L;
	static JPanel panel = new JPanel();
	static JPanel panel1 = new JPanel ();
	static JPanel panel2 = new JPanel ();
	static JPanel panel3  = new JPanel ();
	private static JButton click = new JButton("Clik to select");
	

	public static void main(String[] args) {
		JFrame window = new JFrame("Picker");
		window.add(panel);
		window.setSize(200, 200);
		window.setVisible(true);
		panel.setLayout(new GridLayout(1,3));
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		
		final JButton[] buttons = new JButton [5];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button " + i);
			buttons[i].setOpaque(true);
		    buttons[i].setBorderPainted(false);
			panel1.add(buttons[i]);
			
			buttons[i].addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					click.setBorderPainted(false);
					click.setOpaque(true);
					JButton b = (JButton)e.getSource(); 
					if (b == buttons[0]) {
						click.setBackground(Color.BLUE);
					} else if (b == buttons[1]) {
						click.setBackground(Color.RED);
					} else if(b == buttons[2]) {
						click.setBackground(Color.GRAY);
					} else if (b == buttons [3]) {
						click.setBackground(Color.MAGENTA);
					} else if (b == buttons[4]) {
						click.setBackground(Color.ORANGE);
					}
					
				}
				
			});
			
		}
		buttons[0].setBackground(Color.BLUE);
		buttons[1].setBackground(Color.RED);
		buttons[2].setBackground(Color.GRAY);
		buttons[3].setBackground(Color.MAGENTA);
		buttons[4].setBackground(Color.ORANGE);
		panel1.setLayout(new GridLayout(5,2));
		panel2.add(click);
		click.setSize(new Dimension(200 - 100, 200));
		
	   
		
	}

}
