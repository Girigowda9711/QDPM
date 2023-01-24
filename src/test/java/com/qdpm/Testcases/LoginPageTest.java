package com.qdpm.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qdpm.BaseTest.BaseClass;
import com.qdpm.Pageclass.LoginPage;
import com.qdpm.ProFile.ProfileData;

public class LoginPageTest extends BaseClass {
	@Test
	public void verifyuserLogin() {
		
		LoginPage loginpage=new LoginPage();
		loginpage.verifyUserLogin(ProfileData.getDataByKey("username"),
				ProfileData.getDataByKey("password"));
		loginpage.clickOnLoginBtn();
		
		
		boolean dashboard = loginpage.dashboardDispaly();
		Assert.assertTrue(dashboard,"HomePage is displayed");

	}
	
	










}
