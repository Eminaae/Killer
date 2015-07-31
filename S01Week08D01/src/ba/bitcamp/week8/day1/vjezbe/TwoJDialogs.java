package ba.bitcamp.week8.day1.vjezbe;

import java.awt.Dialog.ModalityType;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;


/**
 * 
 * @author emina.arapcic
 *
 */
public class TwoJDialogs extends JFrame {
	
	
	private JDialog dialog1 = new JDialog();
	private JDialog dialog2 = new JDialog();
	private JButton button1 = new JButton("button1");
	private JButton button2 = new JButton("button2");
	
	public TwoJDialogs(){
		setLayout(new GridLayout(2,1));
		setSize(200,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(button1);
		add(button2);
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		setVisible(true);
	}
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button1){
				dialog1=new JDialog();
				dialog1.setSize(100,100);
				dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog1.setLocationRelativeTo(null);
				dialog1.setModalityType(ModalityType.MODELESS);
				dialog1.setVisible(true);
			} else if(e.getSource() == button2){
				dialog2=new JDialog();
				dialog2.setSize(100,100);
				dialog2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog2.setLocationRelativeTo(null);
				dialog2.setModalityType(ModalityType.APPLICATION_MODAL);
				dialog2.setVisible(true);
			}	
		}	
	}
	
	public static void main(String[] args) {
		new TwoJDialogs();
	}
}

	
