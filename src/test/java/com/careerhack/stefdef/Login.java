package com.careerhack.stefdef;

import com.careerhack.common.FlightBase;
import com.careerhack.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends FlightBase {
	
HomePage hp;

@Given("^i am on the flight homepage$")
public void i_am_on_the_flight_homepage(){
  
	launchBrowser();
	
	
}

@When("^i enter \"([^\"]*)\", \"([^\"]*)\"$")
public void i_enter(String arg1, String arg2){
     hp = new HomePage (driver);
    hp.enterUserName(arg1);
    hp.enterPassword(arg2);
}

@When("^i click sign in button$")
public void i_click_sign_in_button() {
    hp.ClickSignin();
	
} 

@Then("^i am on the flight reservation page$")
public void i_am_on_the_flight_reservation_page(){
    
	String title;
	title = driver.getTitle();
	System.out.println(title);
	closeBrowser();
	
}


}
