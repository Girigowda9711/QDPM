package com.qdpm.Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.qdpm.ProFile.ProfileData;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count=0;
	int retrycount=Integer.valueOf(ProfileData.getDataByKey("recount"));
	
	public boolean retry(ITestResult result) {
		if(count<retrycount) {
			count++;
			return true;
		}
		return false;
	}

}
