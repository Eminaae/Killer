package ba.bitcamp.ime;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ime {

	public static void main(String[] args) {
		//server
		try{
				Socket socket = new Socket();
				socket.connect(new InetSocketAddress("10.0.82.98", 8000));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				writer.write("Emina");
				writer.newLine();
				writer.close();
				}	catch(IOException e) {
					e.printStackTrace();
				}
	}
		//HashMap<String, String> map = new HashMap<>();
		//map.put("10.0.2.89", "Zaid");
		
//	    JFrame msg = new JFrame();
//		JPanel panel = new JPanel();
//		JButton button = new JButton("Send");
//		JTextArea text = new JTextArea();
//		msg.add(panel);
//		msg.setSize(200, 200);
//		msg.setLocationRelativeTo(null);
//		
//		panel.setLayout(new BorderLayout());
//		panel.add(button, BorderLayout.NORTH);
//		panel.add(text, BorderLayout.CENTER);
//		msg.setVisible(true);
//		
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try{
//					Socket socket = new Socket();
//					socket.connect(new InetSocketAddress("10.0.82.98", 7777));
//					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//					writer.write(text.getText());
//					writer.newLine();
//					writer.close();
//					}	catch(IOException e1) {
//						e1.printStackTrace();
//					}
//			}
//		});
//	}
}
