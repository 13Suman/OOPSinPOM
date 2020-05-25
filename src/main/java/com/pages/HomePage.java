/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Suman
 *
 */
public class HomePage extends BasePage {
	
	private By header= By.xpath("//h1[text()='Dashboard']");

	public HomePage(WebDriver driver) {
		super(driver);	
	}
	public WebElement getHeader() {
		return getElement(header);
	}
	//page actions
	
	public String getHomePageTitle() {
		return getPageTitle();
	}

	public String getHomePageHeader() {
		return getPageHeader(header);
	}
}
