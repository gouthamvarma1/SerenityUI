package com.google.stepdefentions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
public class Stepsnew {
	@Steps
	SummarySteps summarysteps;
	
	
	@Given("^Load google homepage$")
	public void load_google_homepage() {
	    summarysteps.launchGoogleTest();
	    
	}

	 @When("^Enter user inputs (.+)$")
	public void enter_user_inputs(String arg1) {
	summarysteps.enterKeyword(arg1);    
	    
	}

	@Then("^Click search button$")
	public void click_search_button() {
	summarysteps.clickSearchButton();    	
	
	}	
}
