package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LoginPage extends BasePage {

		
	@FindBy(id="login_id")
	public WebElement EmailField;
	
	//@FindBy(id="nextbtn")
	//public WebElement NextButton;
	
	@FindBy(id="password")
	public WebElement PasswordField;
	
	@FindBy(className="btn blue")
	public WebElement SignInButton;
	
	//Any other webElement on login page
	
	//CONSTRUCTOR CODE HERE
		public LoginPage(WebDriver driver,ExtentTest eTest) {
			
			this.driver = driver;
			this.eTest = eTest;
		
		}
	
	//Reusable methods of login page
	
	public boolean doLogin() {
		
		//Selenium Automation code for logging into Application
		
	EmailField.sendKeys(Constants.USERNAME);
	
	eTest.log(LogStatus.INFO, "Username got entered into the Email address field on Login Page");
	
	
	PasswordField.sendKeys(Constants.PASSWORD);
	
	eTest.log(LogStatus.INFO, "Password got entered Successfully");
		
	SignInButton.click();	
	
	eTest.log(LogStatus.INFO, "Signin button got clicked");
		
		HomePage homepage = new HomePage(driver,eTest);
		PageFactory.initElements(driver, homepage); // initialize the web element in home page 
		
		boolean loginStatus =  homepage.verifyDisplayofHomePage();
		
		return loginStatus;
		
	}
	
	//Any other Reusable Methods 
	
}
