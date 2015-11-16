package vjezbeS12D02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StoppingMultipleThreads extends JFrame {
	private static final long serialVersionUID = 1282818398415990174L;
	private JPanel panel = new JPanel();
	private JButton addButton = new JButton("ADD");
	private JButton stop = new JButton("STOP");
	Thread t;
	static ArrayList<Thread> threadlist = new ArrayList<Thread>();

	public StoppingMultipleThreads() {
		add(panel);
		panel.setLayout(new GridLayout(2, 1, 10, 10));
		panel.add(addButton);
		panel.add(stop);

		addButton.addActionListener(new ButtonHandler());
		stop.addActionListener(new ButtonHandler());

		panel.setToolTipText("Stopping Multiple Threads");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new StoppingMultipleThreads();

	}

	public class MyThread implements Runnable {

		@Override
		public void run() {
			while (true) {

				for (int i = 0; i < 100; i++) {
					System.out.println(i);

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						return;
					}
				}

			}
		}
	}

	public class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(addButton)) {
				t = new Thread(new MyThread());
				t.start();
				threadlist.add(t);
			} else if (e.getSource().equals(stop)) {
				for (int i = 0; i < threadlist.size(); i++) {
					threadlist.get(i).interrupt();
					System.out.println("Is thread: " + threadlist.get(i)
							+ " alive? " + threadlist.get(i).isAlive());
				}
			}
		}
	}
}
