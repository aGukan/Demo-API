package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest2 {
	
	@Test(description="Verify the if the login page is working or not..")
	public void loginTest() {
//		RestAssured.baseURI="http://64.227.160.186:8080";
//		RequestSpecification x=  RestAssured.given();
//		RequestSpecification y =x.header("Content-Type","application/json");
//		RequestSpecification z =y.body("{\r\n"
//				+ "  \"username\": \"uday123\",\r\n"
//				+ "  \"password\": \"uday123\"\r\n"
//				+ "}");
//		Response response=z.post("/api/auth/login");
//		System.out.print(response.asPrettyString());
//		Assert.assertEquals(response.getStatusCode(), 200);
		
        System.out.println("Test");
	}

}
