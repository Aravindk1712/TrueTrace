package com.Saucedemo.SaucerMaven;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SaucerProject {
@Test
public void Data_validation() {
	RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	RequestSpecification request= RestAssured.given();
	Response response=request.get("posts");
	String response_body= response.asString();
	
	System.out.println(response_body);
	int statusCode=response.getStatusCode();
	System.out.println("status code"+statusCode);
	Assert.assertEquals(200, statusCode);
	System.out.println("Data validation successfull");
	
	
}
}
