package JJParser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder (value= {
		"name",
		"id",
		"gender",
		"address",
		"salary"
})
public class Person {
	String name,gender,address;
	int id,salary;
	
	public Person(String name,String gender,String address,int id,int salary)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.id=id;
		this.salary=salary;
	}
	
	Person()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}

	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}

	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "The data is [ name="+name+ "gender =" +gender+"address ="+address+"id="+id+"salary="+salary+"]";
	}

}
