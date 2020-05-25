/**
 * 
 */
package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.pages.BasePage;
import com.pages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Suman
 *
 */
public class BaseTest {

	WebDriver driver;
	public Page page;

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String browser) throws InterruptedException {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("No browser is defined ");
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		// passing driver to the Page Class
		page = new BasePage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
