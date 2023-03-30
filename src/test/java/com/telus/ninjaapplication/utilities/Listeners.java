package com.telus.ninjaapplication.utilities;


	import java.io.IOException;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	public class Listeners extends ScreenShot implements ITestListener {
		@Override
		public void onTestStart(ITestResult result) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Test Case started is :"+result.getName());
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ScreenShot s1=new ScreenShot();
			try {
				s1.getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Test Case Pass is :"+result.getName());

		}
		@Override
		public void onTestFailure(ITestResult result) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ScreenShot s1=new ScreenShot();
			try {
				s1.getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Test Case Faild is :"+result.getName());
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ScreenShot s1=new ScreenShot();
			try {
				s1.getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Test Case Skipped is :"+result.getName());
		}
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ScreenShot s1=new ScreenShot();
			try {
				s1.getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Test Case Percentage is :"+result.getName());
		}
		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ScreenShot s1=new ScreenShot();
			try {
				s1.getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Test Case Time Out is :"+result.getName());
		}
		@Override
		public void onStart(ITestContext context) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ScreenShot s1=new ScreenShot();
			try {
				s1.getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Execution Started");
		}
		@Override
		public void onFinish(ITestContext context) {
			Screenshots s=new Screenshots();
			try {
				s.captureScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ScreenShot s1=new ScreenShot();
			try {
				s1.getScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Execustion Completed");
		}
	}

