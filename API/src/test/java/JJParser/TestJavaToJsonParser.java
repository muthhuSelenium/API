package JJParser;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJavaToJsonParser {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Person pobj = new Person("anju", "female", "kerala", 12, 50000);
		JavaToJsonParser parser = new JavaToJsonParser();
		parser.marshalling(pobj);

	}

}
