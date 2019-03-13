package org.ListOfAllBreeds;

import org.BaseClassProperties.BaseClass;
import org.openqa.selenium.WebDriver;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ListOfAllBreeds extends BaseClass {
	
	public static WebDriver driver;
	
	public ListOfAllBreeds()
	{
		super(driver);
	}
	
	public void getURL()throws Exception
	{
		killChromeBrowser();
		driver = setupDriver();
				
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getAllBreeds()throws Exception
	{
		
		RestAssured.baseURI = readProperty("list_of_all_dogs");
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(readProperty("list_of_all_dogs"));
		
		ResponseBody body = response.getBody();
		
		String breeds = body.asString();
		
		JsonPath jsonpathevaluator = response.jsonPath();
		
		
		System.out.println(jsonpathevaluator.prettyPrint());
		
		return breeds;
		
	}
	
	public void getSubBreeds(String breed)throws Exception
	{
		RestAssured.baseURI = readProperty("Sub_Breeds")+"/"+breed+"/list";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(readProperty("Sub_Breeds")+"/"+breed+"/list");
		
		JsonPath jsonpathevaluator = response.jsonPath();
		
		
		System.out.println(jsonpathevaluator.prettyPrint());
		
	}
	
	public void getLink(String breed)throws Exception
	{
		
		RestAssured.baseURI = readProperty("Get_Image")+"/"+breed+"/images/random";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(readProperty("Get_Image")+"/"+breed+"/images/random");
		
		JsonPath jsonpathevaluator = response.jsonPath();
		
		
		System.out.println(jsonpathevaluator.prettyPrint());
		
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	

}
