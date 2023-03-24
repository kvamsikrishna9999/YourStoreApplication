package com.telus.ninjaapplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

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
	//   String subscribeButtonXpath = "//label[normalize-space()='Yes']//input[@name='newsletter']";
	// String succesSignUpMsg = "//*[@id="content"]/h1"; 
//	 String logoutXpath = "//*[@id=\"column-right\"]/div/a[13]";

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

	@FindBy(how=How.XPATH,using = "//label[normalize-space()='Yes']//input[@name='newsletter']")
	@CacheLookup
	WebElement subscribeButtonXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"agree\"]")
	@CacheLookup
	WebElement policyXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@value='Continue']")
	@CacheLookup
	WebElement continuBtnXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@id='content']/h1")
	@CacheLookup
	WebElement succSignUPMsgXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"column-right\"]/div/a[13]")
	@CacheLookup
	WebElement logOutXpath;

	public RegisterPage(WebDriver driver) {
		this.driver = driver ;
	}

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
	public void clickRegisterBtn() {
		if(registerXpath.isSelected()) {

			Reporter.log("register button is Selected successfully");
		}
		else {
			System.out.print("register button is not Selected successfully");
		}
		//verify Account btn is enabled are not
		if(registerXpath.isEnabled()) {
			System.out.print("register button is enabled successfully");
			registerXpath.click();
			System.out.print("register button is clicked");
		}
		else {
			System.out.print("My register button is not enabled successfully");		 
		}
	}
	public void getRegisterMsg() throws Exception {
		Thread.sleep(5000);
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
	
	public void setEmail1(String emailInput) {
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
			System.out.println("telephone is displayed successfully as "+ telephoneInput);
		}
		else
		{
			System.out.println("telephone is not displayed successfully");
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
	public void setConfirmPassword(String passwordInput) {
		if(confromPasswordXpath.isDisplayed()) {
			confromPasswordXpath.sendKeys(passwordInput);
			System.out.println("Confirm password is displayed successfully as "+ passwordInput);
		}
		else
		{
			System.out.println("Confirm password is not displayed successfully");
		}
	}
	public void SetSubsBtn() {
			subscribeButtonXpath.click();
			System.out.println("Subscribe button is clicked successfully");
		}
	
	public void clickPolicyBox() {
		policyXpath.click();
		System.out.println("policy check box is clicked successfully");
	}
	
	public void clickContinueBtn() {
		continuBtnXpath.click();
		System.out.println("Continue button is clicked successfully");
	}
	
	public void getSignUpMsg() throws Exception {
		Thread.sleep(5000);
		if(succSignUPMsgXpath.isDisplayed()) {
			System.out.println("SuccessignUp Page is displayed successfully");

			String actRegPageTitle = succSignUPMsgXpath.getText();
			String expRegPageTitle = "Your Account Has Been Created!";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The SuccessignUp title page is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual SuccessignUp page title is : "+ actRegPageTitle);
				System.out.println("The Expected SuccessignUp page title is : "+ expRegPageTitle);
			}
		}
	}
	
	public void clickLogoutBtn() {
		logOutXpath.click();
	}
	
}
