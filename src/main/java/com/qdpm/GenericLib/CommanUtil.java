package com.qdpm.GenericLib;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommanUtil {
	
	public  static String takescreenshot() {
		
	
		TakesScreenshot ts=(TakesScreenshot)DriverFactory.getInstance().getDriver();
	String src = ts.getScreenshotAs(OutputType.BASE64);
	return src;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
