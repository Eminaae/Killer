package vjezbeS08D01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


public class TextEditor extends JFrame{
	private static final long serialVersionUID = -3801255168483553408L;
	private JTextField text = new JTextField ();
	private JMenuBar bar = new JMenuBar();
	private JMenu menu1 = new JMenu("Insert");
	private JMenuItem item1 = new JMenuItem("Insert Text");
	
	TextEditor () {
		setLayout(new BorderLayout());
		add(bar, BorderLayout.NORTH);
		bar.add(menu1);
		menu1.add(item1);
		add(text, BorderLayout.CENTER);
		text.setText("proba");
		text.setEnabled(false);
		
		item1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
				text.setEnabled(true);
			
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setTitle("Example JFrame");
		setVisible(true);
	}
	
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;

		private JTextField field1 = new JTextField();
		private JTextField field2 = new JTextField();
		private JButton click = new JButton("Insert");
		
		public MyDialog() {
			setLayout(new GridLayout(3,0));
			add(field1);
			add(field2);
			add(click, BorderLayout.SOUTH);
			click.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int index = Integer.parseInt(field2.getText());
					String s = text.getText();
					s = s.substring(0, index) + field1.getText() + s.substring(index, s.length());
					text.setText(s);
					dispose();
				}
			});
			
			setModalityType(ModalityType.APPLICATION_MODAL);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Insert text: ");
			setVisible(true);
		}
	}
	


	public static void main(String[] args) {
		new TextEditor();

	}

}
