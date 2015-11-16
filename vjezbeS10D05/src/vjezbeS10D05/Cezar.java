package vjezbeS10D05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Cezar {

	public static void main(String[] args) {
		//JFileChooser open = new JFileChooser();

		LinkedList<String> list = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();
		//int action = open.showOpenDialog(null);

		//if (action == JFileChooser.APPROVE_OPTION) {
			BufferedReader in = null;
			try {
				in = new BufferedReader(new FileReader("Dislodge.txt"));
			} catch (FileNotFoundException e) {
				System.out.println("Cannot find file!");
				e.printStackTrace();
			}
			
			String line = "";
			try {
				while (in.ready()) {
					 line = in.readLine();
					StringTokenizer st = new StringTokenizer(line, " ");
					StringTokenizer st1 = new StringTokenizer(line, "s");
					StringTokenizer st2 = new StringTokenizer(line, "i");
					
					
					while (st.hasMoreTokens()) {
						String s = st.nextToken();
						list.add(s);
					}

//					while (st1.hasMoreTokens()) {
//						String s = st1.nextToken();
//						list2.add(s);
//					}

				}
				
				System.out.println(list);
			} catch (IOException e) {
				e.printStackTrace();
			}
		//}
		String word = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("s")) {
				for (int j = 0; j < list.get(i).length(); j++) {
					int index = list.get(i).indexOf('s');
					 word += list.get(i).substring(0, index) + list.get(i).substring(index + 1, list.get(i).length());
					
				}
			}
		}
	
		System.out.println(list2.add(word));
		System.out.println(list2);
		System.out.println("nova lista");
		System.out.println(list);

	}

}
