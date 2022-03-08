package StepDefinitions;

import CommonSteps.DriverInitializer;
import CommonSteps.aboutUsPage;
import CommonSteps.commonSteps;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutSteps extends DriverInitializer {
	
	aboutUsPage aboutUs = new aboutUsPage(driver);
	commonSteps helper = new commonSteps(driver);
	
//	@After
//	public void tearDown() {
//		System.out.println("broswer close");
//		helper.closeBrowser();
//		
//	}
	
	@Given("browser is open and go to stockbit")
	public void Given_browser_is_open_and_go_to_stockbit() {
		
		startUp();
		
	}
	
	@Given("i see About Us in main page")
	public void i_see_about_us_in_main_page() {
		
		aboutUs.verifyAboutUsbutton();
		
	}
	
	@When("I tap About Us")
	public void i_tap_about_us() {
		
		aboutUs.clickAboutUs();
		
	}
	
	@Then("I will direct to About Us page")
	public void i_will_direct_to_about_us_page() {
		
		aboutUs.verifyAboutUsPage();
		
	}
	
	@Then("i can see informasi perusahaan")
	public void i_can_see_informasi_perusahaan() {
		
		aboutUs.companyInformatio();
		
	}

}
