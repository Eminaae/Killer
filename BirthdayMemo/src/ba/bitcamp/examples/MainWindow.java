package ba.bitcamp.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = -6948440214404681818L;

	JButton btnPrikazi = new JButton("Prikazi");
	JButton btnUnesi = new JButton("Unesi");
	
	public MainWindow() {
		
		setLayout(new FlowLayout());
		
		btnUnesi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new InsertInfo();
				
			}
		});
		
		add(btnPrikazi);
		add(btnUnesi);
		
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}
}
