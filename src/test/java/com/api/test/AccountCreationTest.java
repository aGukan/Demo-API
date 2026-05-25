package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

    @Test(description = "Verify if the signup API is working or not.")
    public void createAccountTest() {

        AuthService authService = new AuthService();

        SignUpRequest signUpRequest = new SignUpRequest.Builder()
                .userName("gukan123")
                .password("Test@123")
                .email("gukan123@gmail.com")
                .firstName("Gukan")
                .lastName("Priyan")
                .mobileNumber("9876543210")
                .build();

        Response response = authService.signUp(signUpRequest);

        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}