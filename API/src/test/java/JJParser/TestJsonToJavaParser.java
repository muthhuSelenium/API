package JJParser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJsonToJavaParser {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		File filename = new File("Person.json");
		JsonToJavaParser p = new JsonToJavaParser();
		Person pobj = p.unmarshalling(filename, Person.class);
		System.out.println(pobj);
	}
}
