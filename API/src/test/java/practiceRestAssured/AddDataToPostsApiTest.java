package practiceRestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddDataToPostsApiTest {
	
	@Test
	public void postDataToPostsApi()
	{
		RequestSpecification preconditionReq = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		jobj.put("id", 75);
		jobj.put("name", "muthu");
		jobj.put("body", "TE");
		
		
		String jsonData = jobj.toJSONString();
		preconditionReq.body(jsonData);
		
		preconditionReq.contentType(ContentType.JSON);
		
		
		RequestSender sender = preconditionReq.when();
		
		Response resp = sender.post("http://localhost:3000/posts");
		
		ValidatableResponse vr = resp.then();
		
		vr.log().all();
		
	}
}
