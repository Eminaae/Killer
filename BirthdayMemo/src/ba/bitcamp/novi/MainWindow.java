package ba.bitcamp.novi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Gives an option to choose read from database or write to database file
 * 
 * @author emina.arapcic
 *
 */
public class MainWindow extends JFrame {

	private static final long serialVersionUID = -6948440214404681818L;

	JButton btnRead = new JButton("Prikazi");
	JButton btnWrite = new JButton("Unesi");

	public MainWindow() {

		setLayout(new GridLayout(2,1));

		btnWrite.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new InsertInfo();

			}
		});

		btnRead.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ShowWindow();
			}
		});

		add(btnRead);
		add(btnWrite);

		setSize(200, 150);
		setTitle("Birthday memo");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainWindow();
	}
}
