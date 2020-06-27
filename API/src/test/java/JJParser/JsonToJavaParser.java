package JJParser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToJavaParser {
	public Person unmarshalling(File filename,Class<Person> pobj) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		Person personData = mapper.readValue(filename, pobj);
		return personData;
	}

	
}
