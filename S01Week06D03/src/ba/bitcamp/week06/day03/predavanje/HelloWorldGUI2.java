package ba.bitcamp.week06.day03.predavanje;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldGUI2 {
	
	private static class TestPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("Test", 20, 50);
		}
	}
		

	public static class HelloWorldDisplay extends TestPanel {
		public void paintComponent(Graphics g){
			super.paintComponent(g); //overwrite paint component funkcije, uradi sve sto uradi JPanel
			g.drawString("Help", 20, 30);//pozivamo grafik g koji smo proslijedili i na njemu crtamo, od tacke 20 30 crta panem helloWorld
		}
	}
	
	
	private static class ButtonHandler implements ActionListener { //moramo iplementrirati ActionListener da bismo mogli 
		public void actionPerformed(ActionEvent e){
			//System.exit(0);//ako nema system exit, ne mozemo izaci na ok button
		}
	}

	private static class ButtonHandler1 implements ActionListener { //moramo iplementrirati ActionListener da bismo mogli 
		JButton button;
		public ButtonHandler1(JButton button){
			super();
			this.button = button;//zabranili smo kreiranje button handlera bez ikakvih parametara	
		}
		public void actionPerformed(ActionEvent e){
/*			
			String buttonText = "O"; // pokupice text
			String buttonText1 = "O";
			if(buttonText.equals("X"))
				button.setText(buttonText);
			else if (buttonText1.equals("O"))
						button.setText(buttonText1);
			else
				button.setText("X");
			button.setText(buttonText); // postavice ovaj text
			*/
			if (button.getText().equals("O")) {
				button.setText("X");
			} else {
				button.setText("O");
			}
		}
	}

	
	public static void main (String[] args){
		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton xoButton = new JButton("Moje ime");
		JButton xButton = new JButton("Moje ime");
		
		ButtonHandler listener = new ButtonHandler(); //osluskuje sta se desava na dugmetu
		xoButton.addActionListener(listener); //na ok button dodajedmo action listener

		xoButton.addActionListener(new ButtonHandler1 (xoButton));

		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());//postavljamo border layout manager EastWestNorthSouthCenter
		content.add(displayPanel, BorderLayout.CENTER);
		content.add(xoButton, BorderLayout.SOUTH);

		JFrame window = new JFrame("GUI TEST");
		window.setContentPane(content);
		window.setSize(250,100);
		window.setLocation(500,700);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
