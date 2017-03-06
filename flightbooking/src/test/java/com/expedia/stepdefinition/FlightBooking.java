package com.expedia.stepdefinition;

import com.expedia.baseclasses.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBooking {
	
	
	@Before
	public void beforeScenario() throws InterruptedException{
		BaseClass.LaunchBrowser();
		
	}
	@After
	public void afterScenario(){
		BaseClass.driver.quit();
	}
	
	@Given("^User is at the Flight tab page$")
	public void user_is_at_the_Flight_tab_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^Clicks on One way button$")
	public void clicks_on_One_way_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Enter 'Paris' as origin and 'London' as destination$")
	public void enter_Paris_as_origin_and_London_as_destination() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Select  (\\d+)/(\\d+)/(\\d+) as departure date and (\\d+)/(\\d+)/(\\d+) as return date$")
	public void select_as_departure_date_and_as_return_date(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
	}

	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() throws Throwable {
	}

	@When("^he enters username$")
	public void he_enters_username() throws Throwable {
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable {
	}

	@Then("^he should be navigated to task page$")
	public void he_should_be_navigated_to_task_page() throws Throwable {
	}

}
