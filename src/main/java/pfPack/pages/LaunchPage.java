package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LaunchPage extends BasePage {

		
	//WEB ELEMENT OF LAUNCH PAGE
	
	@FindBy(className="zh-customers")
	public WebElement Customers;
	
	@FindBy(className="zh-support")
	public WebElement Support;
	
	@FindBy(className="zh-login")
	public WebElement LogIn;
	
	@FindBy(className="zh-Signup")
	public WebElement SignUp;
	
	// Any other locators 
	
	//CONSTRUCTOR CODE HERE
	public LaunchPage(WebDriver driver,ExtentTest eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
	
	}
	
	//Reusable methods of launch page
	
	public boolean goToLoginPage()  {
		
		//Selenium Automation code for taking the user to login page
		
		driver.get(Constants.APP_URL);
		
		eTest.log(LogStatus.INFO, "Application URL got "+Constants.APP_URL+ " got opened");
		
		LogIn.click();
		
		eTest.log(LogStatus.INFO, "Login option got Clicked");
		
		LoginPage loginpage = new LoginPage(driver,eTest);
		PageFactory.initElements(driver, loginpage); // initialize the web element in login page 
		
		boolean loginStatus = loginpage.doLogin();
		
		return loginStatus;
	}
	
	//Any other Reusable method of launch page can be created
	
}
