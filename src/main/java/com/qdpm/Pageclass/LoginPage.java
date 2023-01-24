package com.qdpm.Pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qdpm.GenericLib.DriverFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='login[email]']")
	private WebElement username;
	@FindBy(xpath="//input[@name='login[password]']")
	private WebElement password;
	@FindBy(xpath="//button[text()='Login ']")
	private WebElement Btn_login;
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	public LoginPage() {
		PageFactory.initElements(DriverFactory.getInstance().getDriver(),this);
	}
	
	public void verifyUserLogin(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void clickOnLoginBtn() {
		Btn_login.click();
	}
	
	public boolean dashboardDispaly() {
		
	return	dashboard.isDisplayed();
	}
	
	
	
	
	
	

}
