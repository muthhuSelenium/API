package practiceRestAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchNameByCurrencyCode {
	
	@Test
	public void fetchName()
	{
		System.out.println("Enter the Currency");
		Scanner s=new Scanner(System.in);
		String code = s.next();
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		ArrayList<Object> allcodes = resp.jsonPath().get("currencies.code");
		System.out.println(allcodes);
		ArrayList<String> list = converter(allcodes);
		String country = getCountryNameByCurrency(list, resp, code);
		System.out.println(country);
	}
	

	public String getCountryNameByCurrency(ArrayList<String> lst,Response resp,String codeTOcompare )
	{
		String countryName = null;
		if(lst.contains(codeTOcompare))
		{
				int index = lst.indexOf(codeTOcompare);
				System.out.println(index);
				countryName = resp.jsonPath().get("name["+index+"]");
				
		}
		return countryName;
	}
	
	public ArrayList<String> converter(ArrayList<Object> allcodes)
	{
		ArrayList<String> s = new ArrayList<String>();
		
		for(Object obj:allcodes)
		{
			String s1 = obj.toString();
			s.add(s1);
		}
		return s;
		
	}
}
