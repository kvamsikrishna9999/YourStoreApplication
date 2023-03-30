package com.telus.ninjaapplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

import com.telus.ninjaapplication.base.BaseTest;

public class RegisterPage2 extends BaseTest{
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
	
	      
//		 String fistNameErrorMsgXpath = "div[contains(text(),'First Name must be between 1 and 32 characters!')]";
//		 String lastNameErrorMsgXpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]";
//		 String emailErrorMsgXpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]";
//		 String telephoneErrorMsgXpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]";
//		 String passwordErrorMsgXpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]";
//	     String CorfirmPasswordErrorMsgXpath =  "//div[@class='text-danger']";
//	     String policyErrorMsgXpath = "//div[@class='alert alert-danger alert-dismissible']";

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
	@FindBy(how=How.XPATH,using = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	@CacheLookup
	WebElement fistNameErrorMsgXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-lastname']")
	@CacheLookup
	WebElement lastNameXpath;
	@FindBy(how=How.XPATH,using = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	@CacheLookup
	WebElement lastNameErrorMsgXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-email']")
	@CacheLookup
	WebElement emailXpath;
	@FindBy(how=How.XPATH,using = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	@CacheLookup
	WebElement emailErrorMsgXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-telephone']")
	@CacheLookup
	WebElement telephoneXpath;
	@FindBy(how=How.XPATH,using = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	@CacheLookup
	WebElement telephoneErrorMsgXpath;

	@FindBy(how=How.XPATH,using ="//*[@id='input-password']")
	@CacheLookup
	WebElement passwordXpath;
	@FindBy(how=How.XPATH,using ="//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	@CacheLookup
	WebElement passwordErrorMsgXpath;

	@FindBy(how=How.XPATH,using = "//*[@id='input-confirm']")
	@CacheLookup
	WebElement confromPasswordXpath;
	@FindBy(how=How.XPATH,using = "//div[@class='text-danger']")
	@CacheLookup
	WebElement CorfirmPasswordErrorMsgXpath;

	@FindBy(how=How.XPATH,using = "//label[normalize-space()='Yes']//input[@name='newsletter']")
	@CacheLookup
	WebElement subscribeButtonXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"agree\"]")
	@CacheLookup
	WebElement policyXpath;
	@FindBy(how=How.XPATH,using = "//div[@class='alert alert-danger alert-dismissible']")
	@CacheLookup
	WebElement policyErrorMsgXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@value='Continue']")
	@CacheLookup
	WebElement continuBtnXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@id='content']/h1")
	@CacheLookup
	WebElement succSignUPMsgXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"column-right\"]/div/a[13]")
	@CacheLookup
	WebElement logOutXpath;

	public RegisterPage2(WebDriver driver) {
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
	public void getFirstNameErrorMsg() {
		if(fistNameErrorMsgXpath.isDisplayed()) {
			System.out.println("fistNameErrorMsg is displayed successfully");

			String actRegPageTitle = fistNameErrorMsgXpath.getText();
			String expRegPageTitle = "First Name must be between 1 and 32 characters!";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The First Name Error msg is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual first name error msg is : "+ actRegPageTitle);
				System.out.println("The Expected first name error msg is : "+ expRegPageTitle);
			}
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
	public void getLastNameErrorMsg() {
		if(lastNameErrorMsgXpath.isDisplayed()) {
			System.out.println("LastNameErrorMsg is displayed successfully");

			String actRegPageTitle = lastNameErrorMsgXpath.getText();
			String expRegPageTitle = "Last Name must be between 1 and 32 characters!";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The Last Name Error msg is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual registration page title is : "+ actRegPageTitle);
				System.out.println("The Expected registration page title is : "+ expRegPageTitle);
			}
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
	public void getEmailErrorMsg() {
		if(emailErrorMsgXpath.isDisplayed()) {
			System.out.println("Email ErrorMsg is displayed successfully");

			String actRegPageTitle = emailErrorMsgXpath.getText();
			String expRegPageTitle = "E-Mail Address does not appear to be valid!";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The Email error msg is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual Email error msg is : "+ actRegPageTitle);
				System.out.println("The Expected Email error msg is : "+ expRegPageTitle);
			}
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
	public void getTelephoneErrorMsg() {
		if(telephoneErrorMsgXpath.isDisplayed()) {
			System.out.println("Telephone ErrorMsg is displayed successfully");

			String actRegPageTitle = telephoneErrorMsgXpath.getText();
			String expRegPageTitle = "Telephone must be between 3 and 32 characters!";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The Telephone error msg is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual Telephone error msg is : "+ actRegPageTitle);
				System.out.println("The Expected Telephone error msg is : "+ expRegPageTitle);
			}
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
	public void getPasswordErrorMsg() {
		if(passwordErrorMsgXpath.isDisplayed()) {
			System.out.println("Password ErrorMsg is displayed successfully");

			String actRegPageTitle = passwordErrorMsgXpath.getText();
			String expRegPageTitle = "Password must be between 4 and 20 characters!";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The Password error msg is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual Password error msg is is : "+ actRegPageTitle);
				System.out.println("The Expected Password error msg is : "+ expRegPageTitle);
			}
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
//	public void getConfirmPasswordErrorMsg() {
//		if(CorfirmPasswordErrorMsgXpath.isDisplayed()) {
//			System.out.println("Confirm Password ErrorMsg is displayed successfully");
//
//			String actRegPageTitle = CorfirmPasswordErrorMsgXpath.getText();
//			String expRegPageTitle = "First Name must be between 1 and 32 characters!";
//			if(actRegPageTitle.equals(expRegPageTitle)) {
//				System.out.println("Actual and Expected title is same");
//				System.out.println("The Confirm Password ErrorMsg is displayed as " + actRegPageTitle);
//			}
//			else {
//				System.out.println("Actual and Expected result is not same");
//				System.out.println("The Actual Confirm Password ErrorMsg is : "+ actRegPageTitle);
//				System.out.println("The Expected Confirm Password ErrorMsg is : "+ expRegPageTitle);
//			}
//		}
//	}
	public void SetSubsBtn() {
			subscribeButtonXpath.click();
			System.out.println("Subscribe button is clicked successfully");
		}
	
	public void clickPolicyBox() {
//		policyXpath.click();
		System.out.println("policy check box is clicked successfully");
	}
	public void getPolicyErrorMsg() {
		if(policyErrorMsgXpath.isDisplayed()) {
			System.out.println("Policy ErrorMsg is displayed successfully");

			String actRegPageTitle = policyErrorMsgXpath.getText();
			System.out.println(actRegPageTitle);
			String expRegPageTitle = "W+arning: You must agree to the Privacy Policy!";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				System.out.println("Actual and Expected title is same");
				System.out.println("The Policy ErrorMsg is displayed as " + actRegPageTitle);
			}
			else {
				System.out.println("Actual and Expected result is not same");
				System.out.println("The Actual Policy ErrorMsg is : "+ actRegPageTitle);
				System.out.println("The Expected Policy ErrorMsg is : "+ expRegPageTitle);
			}
		}
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
