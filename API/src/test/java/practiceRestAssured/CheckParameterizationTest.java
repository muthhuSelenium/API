package practiceRestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CheckParameterization {

	@Test
	public void checkParam()
	{
		Response resp = given().queryParam("userId", "7").when().get("http://jsonplaceholder.typicode.com/posts");
		resp.prettyPrint();
	}
	
	
	
}
