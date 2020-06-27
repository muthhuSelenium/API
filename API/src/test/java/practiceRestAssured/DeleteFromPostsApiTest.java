package practiceRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteFromPostsApiTest {
	
	@Test
	public void deleteFromPosts()
	{
		Response resp = RestAssured.delete("http://localhost:3000/posts/51");
		resp.then().log().all();
	}
}
