package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	String dashboardHeaderPage = "Dashboard";
	String addCustomerHeader = "New Customer";
	String fullName = "Selenium May";
	String company = "tesla";
	String email = "abc1234@techfios.com";
	String phone = "12345678";
	String country = "Albania";
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login(userName, password);
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		Assert.assertEquals(dashboardPage.validateDashboarPage(), dashboardHeaderPage, "Dashboard page is not available!");
		dashboardPage.clickOnCustomer();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		Assert.assertEquals(addCustomerPage.validateAddCustomerPage(), addCustomerHeader, "Add Customer page is not available!");
		addCustomerPage.insertFullName(fullName);
		
	}

}
