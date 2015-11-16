package predavanjaS07D04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Task1 {

	public static void main(String[] args) {
		JFrame window = new JFrame ("Layouts"); 
		JPanel container = new JPanel ();
		
		container.setLayout(new FlowLayout(FlowLayout.LEADING, 0,0));
		
	
		
		JButton[] buttons = new JButton [5];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button " + i);
			buttons[i].setForeground(Color.CYAN);
			buttons[i].setOpaque(true);
			//buttons[i].setBorder(BorderFactory.createEmptyBorder(10, 30, 50, 60));
			//buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
			//buttons[i].setBorder(BorderFactory.createMatteBorder(5, 5, 10, 10, Color.BLACK));
			
			//buttons[i].setBorder(BorderFactory.createEtchedBorder());
			if (i %2 == 0) {
			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			} else {
				buttons[i].setBorder(BorderFactory.createLoweredSoftBevelBorder());
			}
			buttons[i].setPreferredSize(new Dimension(100, 100));
			container.add(buttons[i]);
			
		}

		buttons[0].setBackground(Color.BLUE);
		buttons[1].setBackground(Color.RED);
		buttons[2].setBackground(Color.BLACK);
		buttons[3].setBackground(Color.BLUE);
		buttons[4].setBackground(Color.ORANGE);
	
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);

	}

}
