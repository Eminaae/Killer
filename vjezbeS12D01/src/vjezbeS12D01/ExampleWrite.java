package vjezbeS12D01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ExampleWrite {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sarajevo sampion");
		list.add("Zeljo sampion");
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(new File("test.json"), list);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
