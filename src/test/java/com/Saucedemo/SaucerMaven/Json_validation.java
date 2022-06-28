package com.Saucedemo.SaucerMaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_validation {
public static void main(String[] args) throws Throwable   {
	File f= new  File("C:\\Users\\Aravind\\eclipse-workspace\\SaucerMaven\\src\\main\\java\\com\\payload\\payload.json");
	FileReader reader=new FileReader(f);
	JSONParser parser= new JSONParser();
	Object parse=parser.parse(reader);
	JSONObject jsonObj=(JSONObject)parse;
	Object object=jsonObj.get("title");
	String value=object.toString();
	System.out.println("title:"+value);
}
}
