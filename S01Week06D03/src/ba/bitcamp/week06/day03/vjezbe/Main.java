package ba.bitcamp.week06.day03.vjezbe;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2070733898639939514L;
	private JButton text =  new JButton("hh");
	private JButton dugme1 = new JButton("exit");
	private JButton dugme2 = new JButton("exi");
	private JButton dugme3 = new JButton("ex"); //attr prozora

	//konstruktor pravi vidljivost, title, velicinu....prozora
		public Main(){
			
			setLayout(new BorderLayout());
			add(text);
			add(dugme1, BorderLayout.SOUTH);
			
			
			JButton dugme = new JButton ("ok");
			dugme.addActionListener(new Action());
			add(dugme);
			
			setVisible(true);
			setTitle("Prozor");
			setSize(400, 300);
			setLocationRelativeTo(null);
		}
	public static void main(String[] args) {
	/*	JFrame prozor = new JFrame(); //kreiramo prozor
		prozor.setVisible(true);//Da vidimo prozor kreiramo set i get
		prozor.setTitle("Prozor");
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//moramo zatvoriti proyor da bi program prestao da se izvrsava
		prozor.setSize(400, 300);
		prozor.setLocation(820, 400);
		prozor.setLocationRelativeTo(null);//postavlja prozor u centar ekrana
		prozor.setResizable(false);
		*/
		
		//pravimo klasu koja opisje nas prozor ... extendamo Main extends JFrame
		
		new Main();
		
		
	}
	
	//klasa u klasi jer ne treba drugi da je vide
	
	private class Action implements ActionListener {

		@Override // LISTENER METODA
		public void actionPerformed(ActionEvent e) { // Radi kada se okine listener
			e.getWhen(); //kada je pritisnuto dugme
			if(e.getSource() == dugme1){
				System.out.println(dugme1);
			}
			// vraca komponentu koja je pritisnuta
			System.out.println("Trigger"); // pa dugmetu dodamo listener
			
			
		}
		
	}

}
