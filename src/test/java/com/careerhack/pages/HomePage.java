package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="REGISTER")
	WebElement linkRegister;
	
	public void clickRegister() {
		linkRegister.click();
	}
	
	@FindBy(name="userName")
	WebElement uName;
	
	public void enterUserName(String userName) {
		uName.sendKeys(userName);
		
	}
	@FindBy(name="password")
	WebElement uPass;
	
	public void enterPassword(String userPass) {
		uPass.sendKeys(userPass);
		
	}
	
	@FindBy(name="login")
	WebElement login;
	
	public void ClickSignin() {
		login.click();
	}
	
	
}
