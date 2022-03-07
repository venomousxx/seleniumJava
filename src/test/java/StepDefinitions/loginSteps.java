package StepDefinitions;

import java.io.Console;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@Given("browser is open and go to stockbit website")
	public void browser_is_open_and_go_to_stockbit_website() {
		
		System.getProperty("webdriver.chrome.driver", projectPath+"/driver/chromedrive");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
	    driver.get("https://stockbit.com/");
	    
	}
	
	@Given("i see login button")
	public void i_see_login_button() {

		driver.findElement(By.xpath("//*[@class='login-ldn'][text()='Log In']"));
	    
	}
 
	@When("I click login button in homepage")
	public void i_click_login_button_in_homepage() {
		
		driver.findElement(By.xpath("//*[@class='login-ldn'][text()='Log In']")).click();
	    
	}

	@When("i can see username and password field")
	public void i_can_see_username_and_password_field() {
		
		
		String getUrl = driver.getPageSource();
		System.out.println(getUrl);
		driver.findElement(By.xpath("//*[@id='username']"));
		driver.findElement(By.xpath("//*[@id='password']"));
	    
	}

	@When("i input username and password correctly")
	public void i_input_username_and_password_correctly() {
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("hardi.uus.droid@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Stockbit123");
	    
	}

	@When("i click login button")
	public void i_click_login_button() {
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    
	}

	@Then("I will direct to dashboard page")
	public void i_will_direct_to_dashboard_page() {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		if (driver.findElement(By.xpath("//*[@class='announcement-image']")) != null) {
			
			driver.findElement(By.xpath("//*[@type='button'][@class='ant-btn skip-btn ant-btn-lg']")).click();
			
		}
		
		
		driver.findElement(By.xpath("//*[@class='trading-nonlogin']"));
	    
	}


}
