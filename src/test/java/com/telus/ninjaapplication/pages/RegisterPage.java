package com.telus.ninjaapplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.telus.ninjaapplication.base.BaseTest;

public class RegisterPage extends BaseTest{
	// String myAccountXpath = "//*[@id='top-links']/ul/li[2]/a/span[1]";
	// String registerXpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
	// String registerPageMsgXpath = "//*[@id=\"content\"]/h1";
	// String firstNameXpath = "//*[@id='input-firstname']";
	// String lastNameXpath = "//*[@id=\"input-lastname\"]";
	// String emailXpath = "//*[@id=\"input-email\"]";
	// String telephoneXpath = "//*[@id=\"input-telephone\"]";
	// String passwordXpath = "//*[@id=\"input-password\"]";
	// String confromPasswordXpath = "//*[@id=\"input-confirm\"]";
	//   String subscribeButtonXpath = "//*[@id='content']/form/fieldset[3]/div/div/label[1]/input";

	@FindBy(how=How.XPATH,using = "//*[@id='top-links']/ul/li[2]/a/span[1]")
	@CacheLookup
	WebElement myAccountXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
	@CacheLookup
	WebElement registerXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='content']/h1")
	@CacheLookup
	WebElement registerPageMsgXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-firstname']")
	@CacheLookup
	WebElement firstNameXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-lastname']")
	@CacheLookup
	WebElement lastNameXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-email']")
	@CacheLookup
	WebElement emailXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-telephone']")
	@CacheLookup
	WebElement telephoneXpath;

	@FindBy(how=How.XPATH,using ="//*[@id='input-password']")
	@CacheLookup
	WebElement passwordXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-confirm']")
	@CacheLookup
	WebElement confromPasswordXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='content']/form/fieldset[3]/div/div/label[1]/input")
	@CacheLookup
	WebElement subscribeButtonXpath;

	public RegisterPage(WebDriver driver) {
		this.driver = driver ;
	}

	public void clickAccountName() {
		Actions action = new Actions(driver);
		action.moveToElement(myAccountXpath).click();	
	}
	public void clickRegisterBtn() {
		Actions action = new Actions(driver);
		action.moveToElement(registerXpath).click();	 
	}
	public void getRegisterMsg() {
		if(registerPageMsgXpath.isDisplayed()) {
			System.out.println("Registration Page is displayed successfully");

			String actRegPageTitle = registerPageMsgXpath.getText();
			String expRegPageTitle = "Register Account";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The Registration title page is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual registration page title is : "+ actRegPageTitle);
				System.out.println("The Expected registration page title is : "+ expRegPageTitle);
			}
		}
	}
	public void setFirstName(String firstNameInput) {
		if(firstNameXpath.isDisplayed()) {
			firstNameXpath.sendKeys(firstNameInput);
			System.out.println("FirstName is displayed successfully as "+firstNameInput);
		}
		else
		{
			System.out.println("FirstName is not displayed successfully");
		}
	}
	public void setLastName(String lastNameInput) {
		if(lastNameXpath.isDisplayed()) {
			lastNameXpath.sendKeys(lastNameInput);
			System.out.println("LastName is displayed successfully as "+ lastNameInput);
		}
		else
		{
			System.out.println("LastName is not displayed successfully");
		}
	}
	public void setEmail(String emailInput) {
		if(emailXpath.isDisplayed()) {
			emailXpath.sendKeys(emailInput);
			System.out.println("Email is displayed successfully as "+ emailInput);
		}
		else
		{
			System.out.println("Email is not displayed successfully");
		}
	}
	public void setTelephone(String telephoneInput) {
		if(telephoneXpath.isDisplayed()) {
			telephoneXpath.sendKeys(telephoneInput);
			System.out.println("Email is displayed successfully as "+ telephoneInput);
		}
		else
		{
			System.out.println("Email is not displayed successfully");
		}
	}
	public void setPassword(String passwordInput) {
		if(passwordXpath.isDisplayed()) {
			passwordXpath.sendKeys(passwordInput);
			System.out.println("Email is displayed successfully as "+ passwordInput);
		}
		else
		{
			System.out.println("Email is not displayed successfully");
		}
	}	
	public void setConfirmPassword(String passwordInput) {
		if(confromPasswordXpath.isDisplayed()) {
			confromPasswordXpath.sendKeys(passwordInput);
			System.out.println("Email is displayed successfully as "+ passwordInput);
		}
		else
		{
			System.out.println("Email is not displayed successfully");
		}
	}
}
