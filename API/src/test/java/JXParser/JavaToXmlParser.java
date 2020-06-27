package JXParser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXmlParser {
	
	public void marshalling(Employee eobj) throws JAXBException{
	
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		Marshaller m = jb.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(eobj, System.out);
		
		m.marshal(eobj, new File("Employee.xml"));
	}
	
}
