package vjezbeS07D03;


import javax.swing.JOptionPane;

public class Example3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			
		int choice = JOptionPane.showConfirmDialog(null, "Print a?");
		
		if (choice == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "A = " + a);
		} else if (choice == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "Okay, I won't print it.");
		} else if (choice == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Okay, you canceled.");
		}
	}

}