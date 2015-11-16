package vjezbeS12D01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ExempleReader {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<String> list = new ArrayList<String>();
	
		try {
			list = mapper.readValue(new File("test.json"), ArrayList.class);
			System.out.println(list);
			
		} catch (JsonParseException e) {
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
