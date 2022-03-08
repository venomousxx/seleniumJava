package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonSteps.DriverInitializer;
import CommonSteps.commonSteps;
import CommonSteps.loginPage;
import CommonSteps.logoutPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutSteps extends DriverInitializer {

	commonSteps helper = new commonSteps(driver);
	logoutPage logout = new logoutPage(driver); 
	
	@After
	public void tearDown() {
		System.out.println("broswer close");
		helper.closeBrowser();
		
	}
	
	@Given("I already login to stockbit")
	public void i_already_login_to_stockbit() {
		
		startUp();
		helper.loginStockbit();
	    
	}

	@When("I click my avatar icon")
	public void i_click_my_avatar_icon() {
		
		System.out.println("here");
		helper.wait(10);
		logout.clickAvatar();
	    
	}

	@Then("I see popover menu")
	public void i_see_popover_menu() {
		
		helper.wait(5);
		logout.verifyPopoverMenuDisplayed();
	    
	}

	@Then("i click logout button")
	public void i_click_logout_button() {
		
		logout.clickLogoutButton();
	    
	}

	@Then("i logout from stockbit")
	public void i_logout_from_stockbit() {
		
		helper.wait(10);
		logout.verifyHomePage();
	    
	}


}
