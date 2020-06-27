package practiceRestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class UpdatePartiallyToApi {
	
	@Test
	public void updatePartiallyToPostsAPi()
	{
		RequestSpecification preConditionReq = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		jobj.put("body", "Test");
	
		String jsonData = jobj.toJSONString();
		preConditionReq.body(jsonData);
		
		preConditionReq.contentType(ContentType.JSON);
		
	RequestSender sender = preConditionReq.when();
	Response resp = sender.patch("http://localhost:3000/posts/1");
	ValidatableResponse vr = resp.then();
	vr.log().all();
	
	
	}
}
