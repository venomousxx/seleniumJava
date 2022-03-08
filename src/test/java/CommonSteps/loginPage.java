package CommonSteps;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	By txt_username = By.xpath("//*[@id='username']");
	By txt_password = By.xpath("//*[@id='password']");
	By btn_login = By.xpath("//*[@id='loginbutton']");
	By announchmentModal = By.xpath("//*[@class='announcement-image']");
	By skipAnnounchmentModal = By.xpath("//*[@type='button'][@class='ant-btn skip-btn ant-btn-lg']");
	By btn_login_home = By.xpath("//*[@class='login-ldn'][text()='Log In']");
	By btn_start_trading = By.xpath("//*[@class='trading-nonlogin']");
	By btn_logInGoogle = By.xpath("//*[@value='Log in with Google']");
	By btn_logInFacebook = By.xpath("//*[@class='loginlogin login-fb' and text() = 'Log in with Facebook']");
	
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public void enterUsername(String userName) {
		
		driver.findElement(txt_username).sendKeys(userName);;

	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);;

	}
	
	public void clickLoginButton() {
		
		driver.findElement(btn_login).click();

	}
	
	public void verifyLoginButtonHomePage() {
		
		driver.findElement(btn_login_home);
	

	}
	
	public void clickLoginButtonHomepage() {
		
		driver.findElement(btn_login_home).click();

	}
	
	
	public void handleAnnouncementModal() {
		
	if (driver.findElement(announchmentModal).isDisplayed()) {
			
			driver.findElement(skipAnnounchmentModal).click();
			
		}
		
	}
	
	public void verifyUsernameField() {
		
		driver.findElement(txt_username).isDisplayed();
	
		
	}
	
	public void verifyPasswordField() {
		
		
		driver.findElement(txt_password).isDisplayed();
	
		
	}
	
	public void verifyLoginUrl() {
		
		driver.getCurrentUrl().equals("https://stockbit.com/#/login");		
		
	}
	
	public void verifyIsDashboardPage() {
		
		driver.findElement(btn_start_trading).isDisplayed();
		
	}
	
	public void verifySSOLogin() {
		
		driver.findElement(btn_logInGoogle).isDisplayed();
		driver.findElement(btn_logInFacebook).isDisplayed();
		
	}

}
