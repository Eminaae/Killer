package likes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Likes {

	public static void main(String[] args) {
		BufferedReader reader = null;
		String line;
		Map movies = new HashMap();
		
		
		try {
			 reader = new BufferedReader(new FileReader("likes.txt"));
			
			while ((line = reader.readLine()) != null){
				String parts[] = line.split(",");
				String names[] = parts[0].split(" "); 
				String name[] = names[0].split(" ");
				if (names[0].get){
					
				}
				
				for (int i = 1; i < parts.length; i++ ){
					for(int j = 0; j < names.length; j++){
						//movies.put(names[0], parts[1]);
					}
					
					
				}
				System.out.print(name[0].toString());
				
			}
			
		} catch(IOException e){
			System.out.println("Can't read file");
			e.printStackTrace();
		}

	}

}
