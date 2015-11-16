package vjezbeS11D02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Task2Chat extends JFrame {
	private static final long serialVersionUID = 8054345743067442489L;
	private JTextField text = new JTextField();
	private JButton button = new JButton("SEND");

	public Task2Chat() {
		setBackground(Color.MAGENTA);
		setLayout(new GridLayout(2, 1));
		add(text);
		add(button);

		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					Socket socket;
					try {
						socket = new Socket("10.0.82.98", 8000);
						BufferedWriter writer = new BufferedWriter(
								new OutputStreamWriter(socket.getOutputStream()));

						writer.write(text.getText());
						writer.newLine();
						writer.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					System.out.println("Poslata poruka.");
				}

			}

		});

	}

	public static void main(String[] args) {
		new Task2Chat();
	}

}
