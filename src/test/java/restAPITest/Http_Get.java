package restAPITest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Http_Get {
	@Test
	void GetMethod() {
		RestAssured.baseURI ="https://reqres.in/";
		 //request object for type of request
		RequestSpecification httprequest = RestAssured.given();
		
		//create response object
		Response httpresponse = httprequest.request(Method.DELETE,"api/users?page=2");
		
		String body = httpresponse.getBody().asString();
		System.out.println(body);
		
		int code = httpresponse.getStatusCode();
		
		Assert.assertEquals(204, code);
		
		String status = httpresponse.getStatusLine();
		System.out.println(status);
		
	}
}
