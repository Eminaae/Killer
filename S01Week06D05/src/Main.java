import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main extends JFrame{

	private static final long serialVersionUID = -6171680280666408902L;
	private JButton [] buttons = new JButton[4];
	private String [] textOnButtons = {"ok", "cancel", "exit", "close"};
	public Main(){
		setLayout(new GridLayout());
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton(textOnButtons[i]);
			buttons[i].addActionListener(new Action());
		}
		add (new JLabel());
		add (new JLabel());
		
		setTitle("GridLayout");
		setSize(400,300);
		setLocation(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i =0; i < buttons.length; i++){
				if(e.getSource() == buttons[i]){
					System.out.println(textOnButtons[i]); //isprinta sta je tekst na svakom dugmetu
				}
			}
			
		}
		
	}

}
