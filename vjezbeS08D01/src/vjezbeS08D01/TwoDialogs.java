package vjezbeS08D01;

import java.awt.GridLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TwoDialogs extends JFrame {
	private static final long serialVersionUID = 7961531042700510391L;
	private JButton button1 = new JButton("MODELESS");
	private JButton button2 = new JButton("MODAL");

	public TwoDialogs() {
		setLayout(new GridLayout(2, 0));
		add(button1);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button1) {
					JDialog dialog1 = new JDialog();
					dialog1.setModalityType(ModalityType.MODELESS);
					dialog1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					dialog1.setSize(200, 100);
					dialog1.setLocationRelativeTo(null);
					dialog1.setTitle("Modeless Dialog");
					dialog1.setVisible(true);
				}

			}

		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button2) {
					JDialog dialog2 = new JDialog();
					dialog2.setModalityType(ModalityType.APPLICATION_MODAL);
					dialog2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					dialog2.setSize(200, 100);
					dialog2.setLocationRelativeTo(null);
					dialog2.setTitle("Modal Dialog");
					dialog2.setVisible(true);
				}
			}

		});

		add(button2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setTitle("Two JDialogs");
		setVisible(true);
	}

	public static void main(String[] args) {
		new TwoDialogs();
	}

}
