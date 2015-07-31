package ba.bitcamp.week7.day4.predavanja;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class PickColor extends JPanel {
public static void main(String[] args) {
		
		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();
		Random rm = new Random();
		
		//panel1
		JPanel panel1 = new JPanel();
		JButton[] buttons = new JButton[12];
		
		for(int i = 0; i < buttons.length; i ++){
			buttons[i] = new JButton();
			buttons[i].setPreferredSize(new Dimension(40,40));
			panel1.add(buttons[i]);
			buttons[i].setOpaque(true);
			buttons[i].setBackground(new Color(rm.nextInt(256)));
		}
		panel1.setBackground(Color.BLACK);
		panel1.setPreferredSize(new Dimension(150,200));
		container.add(panel1);
		
		
		
		//panel2
		JPanel panel2 = new JPanel();
		JButton click = new JButton();
		click.setPreferredSize(new Dimension(150,185));
		panel2.add(click);
		panel2.setBackground(Color.GRAY);
		panel2.setPreferredSize(new Dimension(150,200));
		container.add(panel2);
		
		
		
		// panel3
		JPanel panel3 = new JPanel();
		JLabel redLabel = new JLabel("red");
		JLabel greenLabel = new JLabel("green");
		JLabel blueLabel = new JLabel("blue");
		
		JSlider redSlider = new JSlider(0,255);
		JSlider greenSlider = new JSlider(0,255);
		JSlider blueSlider = new JSlider(0,255);
		panel3.add(redLabel);
		panel3.add(redSlider);
		redSlider.setOrientation(JSlider.VERTICAL);
		
		panel3.add(greenLabel);
		panel3.add(greenSlider);
		greenSlider.setOrientation(JSlider.VERTICAL);
		
		panel3.add(blueLabel);
		panel3.add(blueSlider);
		blueSlider.setOrientation(JSlider.VERTICAL);
		
		panel3.setBackground(Color.PINK);
		panel3.setPreferredSize(new Dimension(300,200));
		container.add(panel3);
		
		
		
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);
		
	}
	
	private void initSlider(JSlider slider, String name, Dimension d) {
		slider.setName(name);
		slider.setOrientation(JSlider.VERTICAL);
	}

	
	

}
