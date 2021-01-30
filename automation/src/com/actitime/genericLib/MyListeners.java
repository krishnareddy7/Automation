package com.actitime.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class MyListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"method started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"method passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"method failed",true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		try {
			wlib.takePageScreenshot(result.getName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"method Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
    Reporter.log(context.getName()+"starts",true);
	}

	@Override
	public void onFinish(ITestContext context) {
   Reporter.log(context.getName()+"End",true);
	}
	

}
