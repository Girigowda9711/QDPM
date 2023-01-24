package com.qdpm.Reportsetup;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qdpm.GenericLib.CommanUtil;

public class ListenerImpForExtent implements ITestListener {

	static ExtentReports report;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
	 test = report.createTest(result.getMethod().getMethodName());
	 ExtentFactory.getInstance().setExtent(test);
	 
		
		
	}

	public void onTestFailure(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+ " is Failed.");
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, result.getThrowable());
		
		String screenshot = CommanUtil.takescreenshot();
		ExtentFactory.getInstance().getExtent().addScreenCaptureFromBase64String(screenshot,result.getMethod().getMethodName());
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.SKIP, "Test Case: "+result.getMethod().getMethodName()+ " is skipped.");
		
		ExtentFactory.getInstance().removeExtentObject();
		
	}

	public void onStart(ITestContext context) {
	 report = ExtentSetup.setupreport();
		
	}

	public void onFinish(ITestContext context) {
		
		report.flush();
	}

	public void onTestSuccess(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.PASS, "Test Case: "+result.getMethod().getMethodName()+ " is Passed.");
		ExtentFactory.getInstance().removeExtentObject();
		
	}

}
