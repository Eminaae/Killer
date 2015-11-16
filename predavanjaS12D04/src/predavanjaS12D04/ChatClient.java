package predavanjaS12D04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.CORBA.portable.UnknownException;

public class ChatClient extends JFrame {
	private static final long serialVersionUID = 8054345743067442489L;
	private JTextField text = new JTextField();
	private JButton button = new JButton("SEND");
	private JTextArea area = new JTextArea();

	BufferedWriter writer;
	BufferedReader reader;
	private ExecutorService pool = Executors.newSingleThreadExecutor();
	

	public ChatClient() {
		setLayout(new BorderLayout());
		Socket socket = null;

		try {
			socket = new Socket("10.0.82.96", 6815);
			writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

		} catch (IOException e1) {
			System.exit(1);
			e1.printStackTrace();
		}

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				pool.submit(new Runnable() {

					@Override
					public void run() {
						try {
							writer.write(text.getText());
							text.setText("");
							writer.newLine();
							writer.flush();
						} catch (UnknownException e1) {
							e1.printStackTrace();
						} catch (IOException e2) {
							e2.printStackTrace();
						}

					}
				});
			}
		});

		add(area, BorderLayout.CENTER);
		add(text, BorderLayout.NORTH);
		add(button, BorderLayout.SOUTH);

		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (;;) { // beakonacna petlja kao while (true)

					try {
						String line = reader.readLine();
						area.append(line + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}

				}

			}

		}).start();

	}

	public static void main(String[] args) {
		new ChatClient();
	}

}
