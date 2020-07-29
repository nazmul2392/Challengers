package com.careerhack.stefdef;

import org.openqa.selenium.WebDriver;

import com.careerhack.common.FlightBase;
import com.careerhack.pages.HomePage;
import com.careerhack.pages.Registration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegister extends FlightBase {

	HomePage hp;
	Registration rp;

	@Given("^I am on new tiurs homepage$")
	public void i_am_on_new_tiurs_homepage() {

		launchBrowser();

	}

	@When("^I click on the registar link$")
	public void i_click_on_the_registar_link() {

		hp = new HomePage(driver);
		hp.clickRegister();

	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter(String firstName, String lastName, String phone, String email, String userName, String password,
			String cPassword) {

		rp = new Registration(driver);
		rp.enterfirstName(firstName);
		rp.enterlastName(lastName);
		rp.enterphone(phone);
		rp.enteremail(email);
		rp.enteruserName(userName);
		rp.enterpassword(password);
		rp.confirmPassword(cPassword);

	}

	@When("^I click submit button$")
	public void i_click_submit_button() {

	}

	@Then("^I recive confarmation page and message$")
	public void i_recive_confarmation_page_and_message() {

	}

}
