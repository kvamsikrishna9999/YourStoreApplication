package com.telus.ninjaapplication.testcases;



import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.telus.ninjaapplication.base.BaseTest;
import com.telus.ninjaapplication.pages.LoginCredentials;
import com.telus.ninjaapplication.pages.RegisterPage;
import com.telus.ninjaapplication.pages.RegisterPage2;
import com.telus.ninjaapplication.utilities.ReadXLSData;


public class TestDataEndToEndApplication extends BaseTest{
	String firstNameInput= "Krish";
	String lastNameInput = "Yadav";
	String telephoneInput = "9878987898";
	Random random = new Random(); 
	int em = random.nextInt(1000);
	String emailInput ="krish"+em+"@gamil.com";
	String passwordInput = "Prassu@2022";
	@Test(priority = 1)
	public void getRegisterErrorPage() throws Exception {
		RegisterPage2 registerPage1 = PageFactory.initElements(driver, RegisterPage2.class);
		Thread.sleep(5000);
		registerPage1.clickAccountName();
		Thread.sleep(2000);
		registerPage1.clickRegisterBtn();
		Thread.sleep(2000);
		registerPage1.getRegisterMsg();
		Thread.sleep(2000);
		registerPage1.clickContinueBtn();
		Thread.sleep(2000);
		registerPage1.getFirstNameErrorMsg();
		registerPage1.getLastNameErrorMsg();
		registerPage1.getEmailErrorMsg();
		registerPage1.getTelephoneErrorMsg();
		registerPage1.getPasswordErrorMsg();
		registerPage1.SetSubsBtn();
		registerPage1.clickPolicyBox();
		registerPage1.getPolicyErrorMsg();
	}
@Test(priority = 2)
	public void getRegisterPage() throws Exception {
		RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
		Thread.sleep(2000);
		registerPage.clickAccountName();
		Thread.sleep(2000);
		registerPage.clickRegisterBtn();
		Thread.sleep(2000);
		registerPage.getRegisterMsg();
		Thread.sleep(2000);
		registerPage.setFirstName(firstNameInput);
		Thread.sleep(2000);
		registerPage.setLastName(lastNameInput);
		Thread.sleep(2000);
		registerPage.setEmail1(emailInput);
		Thread.sleep(2000);
		registerPage.setTelephone(telephoneInput);
		Thread.sleep(2000);
		registerPage.setPassword(passwordInput);
		Thread.sleep(2000);
		registerPage.setConfirmPassword(passwordInput);
		Thread.sleep(2000);
		registerPage.SetSubsBtn();
		Thread.sleep(1000);
		registerPage.clickPolicyBox();
		Thread.sleep(1000);
        registerPage.clickContinueBtn();
		Thread.sleep(1000);
         registerPage.getSignUpMsg();
 		Thread.sleep(1000);
       registerPage.clickLogoutBtn();
	}
@Test(priority = 3)
public void getLoginPage1() throws Exception {
	LoginCredentials loginCredentials = PageFactory.initElements(driver, LoginCredentials.class);
	Thread.sleep(1000);
	loginCredentials.clickAccountName();
	Thread.sleep(1000);
	loginCredentials.clickLoginBtn();
	Thread.sleep(1000);
//	loginCredentials.setEmail1();
//	Thread.sleep(1000);
	loginCredentials.setPassword(passwordInput);
	Thread.sleep(1000);
	loginCredentials.clickLoginBtn1();
}

@Test(priority = 4)
public void getLoginPage2() throws Exception {
	LoginCredentials loginCredentials = PageFactory.initElements(driver, LoginCredentials.class);
	Thread.sleep(1000);
	loginCredentials.clickAccountName();
	Thread.sleep(1000);
	loginCredentials.clickLoginBtn();
	Thread.sleep(1000);
	loginCredentials.setEmail1(emailInput);
	Thread.sleep(1000);
//	loginCredentials.setPassword(passwordInput);
//	Thread.sleep(1000);
	loginCredentials.clickLoginBtn1();
}
@Test(priority = 5)
public void getLoginPage() throws Exception {
	LoginCredentials loginCredentials = PageFactory.initElements(driver, LoginCredentials.class);
	Thread.sleep(1000);
	loginCredentials.clickAccountName();
	Thread.sleep(1000);
	loginCredentials.clickLoginBtn();
	Thread.sleep(1000);
	loginCredentials.setEmail1(emailInput);
	Thread.sleep(1000);
	loginCredentials.setPassword(passwordInput);
	Thread.sleep(1000);
	loginCredentials.clickLoginBtn1();
}
}