package com.qdpm.BaseTest;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qdpm.GenericLib.BrowserFactory;
import com.qdpm.GenericLib.DriverFactory;
import com.qdpm.ProFile.ProfileData;

public class BaseClass {



	@BeforeMethod
	public void LaunchApplication() throws Exception {
		BrowserFactory bf = new BrowserFactory();
		String Browser =ProfileData.getDataByKey("browser");
		String url = 	ProfileData.getDataByKey("url");
		String PageTimeout = ProfileData.getDataByKey("pagetimeout");
		String implicitTimeout = ProfileData.getDataByKey("implicittimeout");
		int Itimeout = Integer.parseInt(implicitTimeout);
		int Ptimeout = Integer.parseInt(PageTimeout);
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(Browser));

		DriverFactory.getInstance().getDriver().manage().window().maximize();
		DriverFactory.getInstance().getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Ptimeout));
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Itimeout));
		DriverFactory.getInstance().getDriver().navigate().to(url);

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}






}
