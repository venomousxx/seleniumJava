package StepDefinitions;

import java.io.Console;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonSteps.DriverInitializer;
import CommonSteps.commonSteps;
import CommonSteps.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("unused")
public class loginSteps extends DriverInitializer {
	
	loginPage login = new loginPage(driver);
	commonSteps helper = new commonSteps(driver);
	
	
	@After
	public void tearDown() {
		System.out.println("broswer close");
		helper.closeBrowser();
		
	}
	
	@Given("browser is open and go to stockbit website")
	public void browser_is_open_and_go_to_stockbit_website() {
		startUp();
	}

	@Given("i see login button")
	public void i_see_login_button() {

		login.verifyLoginButtonHomePage();
	    
	}
 
	@When("I click login button in homepage")
	public void i_click_login_button_in_homepage() {
		
		login.clickLoginButtonHomepage();
	    
	}

	@When("i can see username and password field")
	public void i_can_see_username_and_password_field() {
		
		
		login.verifyLoginUrl();
		login.verifyUsernameField();
		login.verifyPasswordField();
		
	    
	}

	@When("i input {string} and {string} correctly")
	public void i_input_and_correctly(String userName, String password) {
		
		login.enterUsername(userName);
		login.enterPassword(password);
	    
	}

	@When("i click login button")
	public void i_click_login_button() {
		
		login.clickLoginButton();
	    
	}

	@Then("I will direct to dashboard page")
	public void i_will_direct_to_dashboard_page() {
		
		login.handleAnnouncementModal();
		login.verifyIsDashboardPage();
	    
	}
	
	@Then("I will see error message displayed")
	public void i_will_see_error_message_displayed() {
		
		helper.wait(10);
		driver.findElement(By.xpath("//*[text()='Username atau password salah. Mohon coba lagi.']"));
		
	}
	
	@Then("I can see SSO login appear")
	public void I_can_see_SSO_login_appear() {
		
		login.verifySSOLogin();
		
	}
	

}
