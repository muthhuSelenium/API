package JXParser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	String name,gender,address;
	int id,salary;
	
	Employee(String name,String gender,String address,int id,int salary)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.id=id;
		this.salary=salary;
	}
	
	Employee()
	{
		
	}
	@XmlElement
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	@XmlAttribute
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	@XmlElement
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	@XmlAttribute
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	@XmlElement
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
