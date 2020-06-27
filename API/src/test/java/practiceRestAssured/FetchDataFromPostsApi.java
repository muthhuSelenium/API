package practiceRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchDataFromPostsApi {
		@Test
		public void getDataRequest()
		{
			Response resp = RestAssured.get("http://localhost:3000/posts");
			int statusCode = resp.getStatusCode();
			System.out.println("Status code:" +statusCode);
			
			String contentType = resp.getContentType();
			System.out.println("The content type is:" +contentType);
			
			long time = resp.getTime();
			System.out.println("Response time is" +time+"ms");
			
			String asString = resp.asString();
			System.out.println("The actual content is :");
			System.out.println(asString);
	
			
			
		}
		
}
