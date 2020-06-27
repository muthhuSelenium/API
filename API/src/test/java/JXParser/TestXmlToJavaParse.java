package JXParser;

import javax.xml.bind.JAXBException;

public class TestXmlToJavaParse {
	public static void main(String[] args) throws JAXBException {
		XmlToJavaParser p = new XmlToJavaParser();
		p.unmarshelling("Employee.xml");
	}
}
