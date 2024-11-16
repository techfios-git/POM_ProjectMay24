package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	String dashboardHeaderPage = "Dashboard";
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		//By Object //By Class name
		driver = BrowserFactory.init();
		
//		LoginPage lp = new LoginPage(driver);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		Assert.assertEquals(dashboardPage.validateDashboarPage(), dashboardHeaderPage, "Dashboard page is not available!");
		
		BrowserFactory.tearDown();
		
	}

}
