package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest3 {

    @Test(description = "Verify if login API is working or not")
    public void loginTest() {

        LoginRequest loginRequest =
                new LoginRequest("uday123", "uday123");

        AuthService authService = new AuthService();

        Response response = authService.login(loginRequest);

        System.out.println(response.asPrettyString());
        
        LoginResponse loginResponse = response.as(LoginResponse.class);

        System.out.println("Token : " + loginResponse.getToken());

        Assert.assertNotNull(loginResponse.getToken());
        Assert.assertEquals(loginResponse.getEmail(), "vicky@gmail.com");
        Assert.assertEquals(loginResponse.getId(), 305);
        System.out.println("Test");
    
    
    }
}