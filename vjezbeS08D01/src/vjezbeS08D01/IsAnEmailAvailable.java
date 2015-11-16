package vjezbeS08D01;

import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IsAnEmailAvailable extends JFrame {
	private static final long serialVersionUID = 7085064960596512582L;
	public static String[] s = new String[] { "neko1@gmail.com",
			"neko2@gamil.com", "neko3@gamil.com" };
	private JTextField mail = new JTextField();
	JDialog dialog1 = new JDialog();

	public IsAnEmailAvailable() {
		add(mail);

		mail.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < s.length; i++) {
						JLabel l1 = new JLabel();
						String s1 = mail.getText();
						
						if (s1.equals(s[i])) {
							dialog1.add(l1);
							l1.setText("Email is availabel.");
							dialog1.setModalityType(ModalityType.APPLICATION_MODAL);
							dialog1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							dialog1.setSize(200, 100);
							dialog1.setLocationRelativeTo(null);
							dialog1.setTitle("Mail");
							dialog1.setVisible(true);
						} else {
							l1.setText("Email is not available.");
							dialog1.add(l1);
							dialog1.setModalityType(ModalityType.APPLICATION_MODAL);
							dialog1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							dialog1.setSize(200, 100);
							dialog1.setLocationRelativeTo(null);
							dialog1.setTitle("Mail");
							dialog1.setVisible(true);
							dialog1.dispose();
	                        break;
						}
					}
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setTitle("Email");
		setVisible(true);
	}

	public static void main(String[] args) {
		new IsAnEmailAvailable();
	}

}
