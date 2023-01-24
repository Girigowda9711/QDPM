package com.qdpm.GenericLib;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
		public WebDriver createBrowserInstance(String browser) throws MalformedURLException {

		WebDriver driver = null;
			

			if(browser.equalsIgnoreCase("Chrome")) {

				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
				driver = new ChromeDriver(options);

			}else if (browser.equalsIgnoreCase("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions foptions = new FirefoxOptions();
				foptions.addArguments("-private");
				
						        

				
				driver = new FirefoxDriver(foptions);

			} 
			return driver;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
