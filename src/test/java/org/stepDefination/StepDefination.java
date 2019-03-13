package org.stepDefination;

import org.ListOfAllBreeds.ListOfAllBreeds;
import org.SearchBreed.SearchBreed;
import org.apache.log4j.Logger;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	Logger logger = Logger.getLogger(StepDefination.class);
	ListOfAllBreeds lsb = new ListOfAllBreeds();
	SearchBreed sb = new SearchBreed();
	boolean flag = true;
	
	@Given("^User is on \"([^\"]*)\" webpage$")
	public void user_is_on_webpage(String arg1) throws Throwable {
		
		logger.info("Started First Test Case");
			
		lsb.getURL();
		
	}

	@When("^Title of the page is \"([^\"]*)\"$")
	public void title_of_the_page_is(String arg1) throws Throwable {
	   
		String title = lsb.getTitle();
		Assert.assertEquals(title, "Dog API","User is not on Home Page");
	    
	}

	@Then("^User will get list of all breeds$")
	public void user_will_get_list_of_all_breeds() throws Throwable {
	 
		logger.info("List of All Breeds Are :");
		String breeds = lsb.getAllBreeds();
		
	}
	
	@Given("^User have list of breeds$")
	public void user_have_list_of_breeds() throws Throwable {
		
		logger.info("User already have list of breeds");
	 
	}

	@When("^User search for \"([^\"]*)\" breed$")
	public void user_search_for_breed(String arg1) throws Throwable {
		
		flag = sb.searchBreed(arg1);
	   
	}

	@Then("^User succesfully get the breed \"(.*)\"$")
	public void user_succesfully_get_the_breed(String arg1) throws Throwable {
	   
		Assert.assertTrue(flag);
		System.out.println("\n\n\nVerify - "+arg1+" is within list");
		
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
		String title = lsb.getTitle();
		Assert.assertEquals(title, "Dog API","User is not on Home Page");
	}

	@When("^User search for a breed \"(.*)\"$")
	public void user_search_for_a_breed(String arg1) throws Throwable {
		
		flag = sb.searchBreed(arg1);
	    
	}

	
	@Then("^User will get all sub breeds of \"([^\"]*)\" breed$")
	public void user_will_get_all_sub_breeds_of_breed(String arg1) throws Throwable {
	   
		Assert.assertTrue(flag);
		logger.info("Sub-breeds of "+arg1+" are as follows:");
		lsb.getSubBreeds(arg1);
	}

	@Given("^User have all list of breeds$")
	public void user_have_all_list_of_breeds() throws Throwable {
	   
		logger.info("User already have list of breeds");
		
	}

	@When("^User search for \"([^\"]*)\" sub breed$")
	public void user_search_for_sub_breed(String arg1) throws Throwable {
	   
		flag = sb.searchBreed(arg1);
	}

	@Then("^User will get link of \"([^\"]*)\" sub breed$")
	public void user_will_get_link_of_sub_breed(String arg1) throws Throwable {
		Assert.assertTrue(flag);
		logger.info("Sub-breeds of "+arg1+" are as follows:");
		lsb.getLink(arg1);
		
		lsb.closeBrowser();
		
	}
	
	
}
