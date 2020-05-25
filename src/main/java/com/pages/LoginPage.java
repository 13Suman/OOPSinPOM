
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Suman
 *
 */
public class LoginPage extends BasePage{

	//page locators
	private By emailId = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By loginBtn = By.id("btnLogin");
	private By header = By.xpath("//div[text()='LOGIN Panel']");
	
	public LoginPage(WebDriver driver) {
		super(driver);	
	}

	//creating public getters
	
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}


	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}

	public WebElement getHeader() {
		return getElement(header);
	}
     
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String usrname, String pwd) {
		getEmailId().sendKeys(usrname);
		getPassword().sendKeys(pwd);
		getLoginBtn().click();
		//page chaining
		return getInstance(HomePage.class);
	}
	public void doLogin() {
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginBtn().click();
	
	}
	
	  
} 
