package predavanjaS07D04;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame ("Layouts"); 
		JPanel container = new JPanel ();
		
		//container.setLayout(new FlowLayout(FlowLayout.LEADING, 100, 200));
		//container.setLayout(new BorderLayout(20, 30));//razmak izmedju dugmadi
		container.setLayout(new GridLayout(2, 3));
		
		JButton[] buttons = new JButton [5];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button " + i);
			buttons[i].setPreferredSize(new Dimension(20, 20));
			container.add(buttons[i]);
		}
		
//		container.add(buttons[0], BorderLayout.EAST);
//		container.add(buttons[1], BorderLayout.WEST);
//		container.add(buttons[2], BorderLayout.NORTH);
//		container.add(buttons[3], BorderLayout.SOUTH);
//		container.add(buttons[4], BorderLayout.CENTER);
		
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);

	}

}