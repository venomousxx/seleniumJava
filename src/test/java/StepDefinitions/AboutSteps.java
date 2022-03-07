package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AboutSteps {
	
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

//	@Given("browser is open and go to stockbit website")
//	public void browser_is_open_and_go_to_stockbit_website() {
//		
//		System.getProperty("webdriver.chrome.driver", projectPath+"/driver/chromedrive");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
//		
//	    driver.get("https://stockbit.com/");
//	    driver.manage().window().maximize();
//	}
//	
	@Given("i see About Us in main page")
	public void i_see_about_us_in_main_page() {
		
		driver.findElement(By.xpath("//*[@class='menuchild'][text()='About Us']"));
		
	}
	
	@When("I tap About Us")
	public void i_tap_about_us() {
		
		driver.findElement(By.xpath("//*[@class='menuchild'][@href='https://stockbit.com/about']")).click();
		
	}
	
	@Then("I will direct to About Us page")
	public void i_will_direct_to_about_us_page() {
		
		driver.findElement(By.xpath("//*[@class='company-information']"));
		
	}
	
	@Then("i can see informasi perusahaan")
	public void i_can_see_informasi_perusahaan() {
		
		driver.getPageSource().contains("Informasi Perusahaan");
		driver.close();
		driver.quit();
		
	}


}
