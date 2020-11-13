package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.base.BasePage;

public class HomePage extends BasePage {
	
		
	@FindBy(css="span[class^='zicon-apps-calendar']")
	public WebElement Calender;
	
	@FindBy(css="span[class^='zicon-apps-cliq']")
	public WebElement Cliq;
	
	@FindBy(css="span[class^='zicon-apps-crm']")
	public WebElement CRM;
	
	@FindBy(css="span[class^='zicon-apps-mail']")
	public WebElement Mail;
	
	@FindBy(css="span[class^='zicon-apps-salesiq']")
	public WebElement SalesIQ;
	
	//CONSTRUCTOR CODE HERE
			public HomePage(WebDriver driver,ExtentTest eTest) {
				
				this.driver = driver;
				this.eTest = eTest;
			
			}
		// Reusable method for verifying whether the user got successfully logged in or not\
			
	public boolean verifyDisplayofHomePage() {
				
		return(isElementPresent(CRM));
		
}
			
	//Reusable method for navigating to calender page
	
	//Reusable method for navigating to Cliq page
	
	//Reusable method for navigating to CRM page
	
	//Reusable method for navigating to Mail page
	
	//Reusable method for navigating to SalesIQ page
	
	
}
