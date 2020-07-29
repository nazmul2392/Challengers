package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	WebDriver driver;
	
	public Registration (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
			}
	
	
	@FindBy(name="firstName")
	WebElement fName;
	
	public void enterfirstName(String firstName) {
		fName.sendKeys(firstName);
		
	}
	
	@FindBy(name="lastName")
	WebElement lName;
	
	public void enterlastName(String lastName) {
		lName.sendKeys(lastName);
		
	}
	
	@FindBy(name="phone")
	WebElement p;
	
	public void enterphone(String phone) {
		p.sendKeys(phone);
		
	}
@FindBy(name="email")
	
	WebElement e;
	
	public void enteremail(String email) {
		e.sendKeys(email);
		
	}
	
	@FindBy(name="userName")
	WebElement uName;
	
	public void enteruserName(String userName) {
		uName.sendKeys(userName);
		
		
	}
	
	
	
	@FindBy(name="password")
	WebElement pword;
	
	public void enterpassword(String password) {
		pword.sendKeys(password);
	}
	
	@FindBy(name="confirmPassword")
	WebElement cPassword;
	
	public void confirmPassword(String confirmPassword) {
		cPassword.sendKeys(confirmPassword);
		
	}
	
	
	
	
	
	
}
