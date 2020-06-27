package JXParser;

import javax.xml.bind.JAXBException;

public class TestJavaToXmlParser {
	public static void main(String[] args) throws JAXBException {
		Employee eobj = new Employee("Muthu", "Male", "Salem", 12, 30000);
		JavaToXmlParser p=new JavaToXmlParser();
		p.marshalling(eobj);
	}
}
