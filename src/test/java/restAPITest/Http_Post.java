package restAPITest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Http_Post {
	@Test
	void PostMethod() {
		RestAssured.baseURI ="https://reqres.in";
		
		//create request object
		
		RequestSpecification req = RestAssured.given();
		
		//create payload 
		JSONObject entity = new JSONObject();
		
		entity.put("name", "morpheus");
		entity.put("job", "leader");
		
		//convert into json
		
		req.header("Content.Type","application/json");
		req.body(entity.toJSONString());
		
		//create response object
		Response res = req.request(Method.POST,"/api/users");
		
		System.out.println(res.getBody());
		
		System.out.println(res.getStatusCode());
		
		Assert.assertEquals(res.getStatusCode(), 201);
		
	
		
		
	}

}
