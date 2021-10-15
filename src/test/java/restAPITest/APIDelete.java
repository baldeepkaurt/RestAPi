package restAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test	
public class APIDelete {
	public void deleteApi() {
		RestAssured.baseURI = "https://reqres.in/";
		
		//create object for request type
		
		RequestSpecification req = RestAssured.given();
		
		//create object of response type
		
		Response res = req.request(Method.DELETE, "/api/users/2");
		
		
		System.out.println(res.getStatusCode());
		
		Assert.assertEquals(res.getStatusCode(), 204);
	
	}
}
