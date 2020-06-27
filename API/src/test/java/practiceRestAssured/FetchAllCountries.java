package practiceRestAssured;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchAllCountries {
	
	@Test
	public void FetchAllCountriesName()
	{
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		
	 Object obj1 = resp.jsonPath().get("name");
	 System.out.println(obj1);
	 ArrayList<Object> list= resp.jsonPath().get("name");
	 Iterator<Object> it = list.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
	 System.out.println("Total countries are :" +list.size());
	}
	
	
}
