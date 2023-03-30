package com.telus.ninjaapplication.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.telus.ninjaapplication.utilities.TestUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties pro;

	public String captureScreenshot(String screenshotName, String result) {
        String date = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        String destPath = "./screenshots/" + screenshotName + "/" + result + "_" + date + ".png";
        File destFile = new File(destPath);

        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }

	@BeforeSuite
	public static void launchApplication() {
		try {
			pro=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"./src/test/java/com/telus/ninjaapplication/base/config.properties");
			pro.load(ip);

		}catch(FileNotFoundException e){
			e.printStackTrace();
		} 
		catch(IOException e){
			e.printStackTrace();
		}

		String browserName=pro.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(pro.getProperty("testURL"));

	}

	@AfterSuite
	public static void closeApplication() {
		driver.quit();
	}
}
