package practiceRestAssured;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchCurrencyCodes {
		
	
	@Test
	public void FetchCurrecyCodes()
	{	
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		
		 ArrayList<Object> obj = resp.jsonPath().get("currencies.code");
		 
		
		Iterator<Object> it = obj.iterator();
		
		while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		
		}
		
	}

