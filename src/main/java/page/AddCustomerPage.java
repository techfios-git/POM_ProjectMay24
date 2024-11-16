package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class AddCustomerPage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong") WebElement NEW_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[1]/div/input") WebElement FULL_NAME_ELEMENT;
	
	
	public String validateAddCustomerPage() {
		String actualText = NEW_CUSTOMER_HEADER_ELEMENT.getText();
		return actualText;
	}
	
	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName);
	}
	
	
	

}
