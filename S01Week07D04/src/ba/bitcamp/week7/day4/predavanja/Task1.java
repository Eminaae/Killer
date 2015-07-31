package ba.bitcamp.week7.day4.predavanja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task1 {
	public static void main(String[] args) {
		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();
		
		container.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));//poravnanje sa lijeve strane, razmak izmedju svakog button horizontalno i vertikalno
		Random rand = new Random();
		JButton[] buttons = new JButton[5];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button" + i);
			buttons[i].setOpaque(true);
			//buttons[i].setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
			//buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 155));
			//buttons[i].setBorder(BorderFactory.createMatteBorder(5, 5, 10, 10, Color.BLACK));
			//buttons[i].setBorder(BorderFactory.createEtchedBorder());
			
			if( i % 2 == 0)
				buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			else
				buttons[i].setBorder(BorderFactory.createLoweredBevelBorder());

				
			buttons[i].setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			buttons[i].setPreferredSize(new Dimension(100, 100));
			//buttons[i].setBounds(0, 0, 0, 0);
			//buttons[i].setMargin(new Insets(0, 0, 0, 0));
			buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			container.add(buttons[i]);
		}
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);
		

	}

}
