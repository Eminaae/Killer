package ba.bitcamp.week8.day1.vjezbe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Task03 extends JFrame{
	
	private JMenuBar bar = new JMenuBar();
	private JMenu menu = new JMenu("Insert");
	private JMenuItem item = new JMenuItem("Insert Text");
	
	public Task03(){
		setJMenuBar(bar);
		bar.add(menu);
		menu.add(item);
		
		item.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
			}
			
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setTitle("***");
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new Task03();

	}

}
