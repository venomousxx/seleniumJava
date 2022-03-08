package CommonSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class commonSteps {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	By txt_username = By.xpath("//*[@id='username']");
	By txt_password = By.xpath("//*[@id='password']");
	By btn_login = By.xpath("//*[@id='loginbutton']");
	By announchmentModal = By.xpath("//*[@class='announcement-image']");
	By skipAnnounchmentModal = By.xpath("//*[@type='button'][@class='ant-btn skip-btn ant-btn-lg']");
	By btn_login_home = By.xpath("//*[@class='login-ldn'][text()='Log In']");
	By btn_start_trading = By.xpath("//*[@class='trading-nonlogin']");
	
	public commonSteps(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void goToBrowser() {
		
		System.getProperty("webdriver.chrome.driver", projectPath+"/driver/chromedrive");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(600));
		
	    driver.get("https://stockbit.com/");
	    
	}
	
	public void loginStockbit() {
		
		driver.findElement(btn_login_home).click();
		driver.findElement(txt_username).sendKeys("hardi.uus.droid@gmail.com");
		driver.findElement(txt_password).sendKeys("Stockbit123");
		driver.findElement(btn_login).click();;
		
		if (driver.findElement(announchmentModal).isDisplayed()) {
				
				driver.findElement(skipAnnounchmentModal).click();
				
			}
		
		driver.findElement(btn_start_trading).isDisplayed();
	    
	}
	
	public void wait(int number) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(number));
	    
	}
	
	public void closeBrowser() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.close();
		driver.quit();
	    
	}
	
	
	
}
