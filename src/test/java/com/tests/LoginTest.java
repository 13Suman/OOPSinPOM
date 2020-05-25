/**
 * 
 */
package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

/**
 * @author Suman
 *
 */
public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Title is:" + title);
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 2)
	public void LoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("Header is:" + header);
		Assert.assertEquals(header, "LOGIN Panel");
	}

	@Test(priority = 3)
	public void doLogin() {
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("Admin", "admin123");
		String headerHome = homepage.getHomePageHeader();
		System.out.println("Header is:" + headerHome);
		Assert.assertEquals(headerHome, "Dashboard");
	}
}
