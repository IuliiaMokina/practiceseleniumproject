package com.practiceseleniumproject.tools;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.internal.IResultListener2;

import com.practiceseleniumproject.app.Practiceselenium;

public class Reporter implements IResultListener2 {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Practiceselenium.takeScreenshot();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Practiceselenium.takeScreenshot();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Practiceselenium.takeScreenshot();

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConfigurationFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConfigurationSkip(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConfigurationSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeConfiguration(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}
