package ba.bitcamp.week11.day3.lectures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
	
	private static final String PATH_TO_PUBLIC = "./Public"; //shows path to public folder
	
	//main iz petlje pozove metodu
	public static String getContent(String route) throws FileNotFoundException,IOException{
		String fullPath = routeBuilder(route);
		//u string ubacimo sve sto smo procitali iz file
		BufferedReader reader = new BufferedReader(new FileReader(fullPath));
		StringBuilder sb = new StringBuilder();
		String content = null;
		//read from file
		while((content = reader.readLine()) != null){
			sb.append(content);
		}
		return sb.toString();
	}

	//
	private static String routeBuilder(String route){
		if(route.equals("/")){
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}
}
