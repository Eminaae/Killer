package vjezbeS06D05;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	private static final long serialVersionUID = -6169359253726011007L;
	
	private JButton button1 = new JButton("OK");
	private JButton button2 = new JButton("Cancle");
	private JButton button3 = new JButton("Exit");
	private JButton button4 = new JButton("Close");
	
	
	private JButton[] buttons = new JButton[4];
	private String[] textOnButtons = {"OK", "Exit", "Close", "Cancel"};
	
	public Main () {
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(textOnButtons[i]);
			buttons[i].addActionListener(new Action());
			add(buttons[i]);
		}
		
		setLayout (new GridLayout(2, 2, 10, 10));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		
		
		setTitle("GridLayout exmeple");
		//pack(); pakuje komponente i odredi im velicinu
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main();

	}
	
	class Action implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					System.out.println(textOnButtons[i]);
				}
			}
		}
	}


}
