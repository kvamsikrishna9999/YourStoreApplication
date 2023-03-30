package com.telus.ninjaapplication.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class LoginCredentials {
//	String loginXpath = "//*[@id="top-links"]/ul/li[2]/ul/li[2]/a";
//	String emailIdXpath = "//input[@id="input-email"]";
//	String passwordXpath = "//input[@id="input-password"]";
//	String loginBtnXpath = "//input[@class="btn btn-primary"]";
	@FindBy(how=How.XPATH,using = "//*[@id='top-links']/ul/li[2]/a/span[1]")
	@CacheLookup
	WebElement myAccountXpath;
	@FindBy(how=How.XPATH,using = "//*[@id='top-links']/ul/li[2]/ul/li[2]/a")
	@CacheLookup
	WebElement loginXpath;
	@FindBy(how=How.XPATH,using = "//input[@id='input-email']")
	@CacheLookup
	WebElement emailIdXpath;
	@FindBy(how=How.XPATH,using = "//input[@id='input-password']")
	@CacheLookup
	WebElement passwordXpath;
	@FindBy(how=How.XPATH,using =  "//input[@class='btn btn-primary']")
	@CacheLookup
	WebElement loginBtnXpath;
	
	public void clickAccountName() {
		if(myAccountXpath.isSelected()) {

			Reporter.log("Account button is Selected successfully");
		}
		else {
			System.out.print("Account button is not Selected successfully");
		}
		//verify Account btn is enabled are not
		if(myAccountXpath.isEnabled()) {
			System.out.print("Account button is enabled successfully");
			myAccountXpath.click();
			System.out.print("Account button is clicked");
		}
		else {
			System.out.print("My Account button is not enabled successfully");
		}
	}
	
	public void clickLoginBtn() {
		if(loginXpath.isSelected()) {

			System.out.print("login button is Selected successfully");
		}
		else {
			System.out.print("login button is not Selected successfully");
		}
		//verify Account btn is enabled are not
		if(loginXpath.isEnabled()) {
			System.out.print("login button is enabled successfully");
			loginXpath.click();
			System.out.print("login button is clicked");
		}
		else {
			System.out.print("My login button is not enabled successfully");		 
		}
	}
	
	public void setEmail1(String emailInput) {
		if(emailIdXpath.isDisplayed()) {
			emailIdXpath.sendKeys(emailInput);
			System.out.println("Email is displayed successfully as "+ emailInput);
		}
		else
		{
			System.out.println("Email is not displayed successfully");
		}
	}
	public void setPassword(String passwordInput) {
		if(passwordXpath.isDisplayed()) {
			passwordXpath.sendKeys(passwordInput);
			System.out.println("password is displayed successfully as "+ passwordInput);
		}
		else
		{
			System.out.println("password is not displayed successfully");
		}
	}
	
	public void clickLoginBtn1() {
		loginBtnXpath.click();
	}
	
	
}
