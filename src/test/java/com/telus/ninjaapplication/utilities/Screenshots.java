package com.telus.ninjaapplication.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.telus.ninjaapplication.base.BaseTest;

public class Screenshots  extends BaseTest {
		public String screenshotpath;

		public void captureScreenShot()  throws IOException{

			Calendar cal= new GregorianCalendar();
			int month =cal.get(Calendar.MONTH);
			int year =cal.get(Calendar.YEAR);
			int sec =cal.get(Calendar.SECOND);
			int min =cal.get(Calendar.MINUTE);
			int date =cal.get(Calendar.DATE);
			int day =cal.get(Calendar.HOUR_OF_DAY);

			//TakesScreenshot scrShot =((TakesScreenshot)driver);

			//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				screenshotpath=System.getProperty("user.dir")+"\\screenshotimage\\"+year+""+date+""+(month+1)+""+day+""+min+""+sec+""+".jpeg";
				FileUtils.copyFile(srcFile,new File(screenshotpath));
			}catch (IOException e) {

				e.printStackTrace();
			}


		}
}
