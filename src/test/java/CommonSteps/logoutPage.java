package CommonSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;



public class logoutPage {
	
	WebDriver driver;
	
	By btn_avatar = By.xpath("//*[@class='popavatar'][@src='https://avatar.stockbit.com/male/ToyFaces_Colored_BG_61-min.png']");
	By popover = By.xpath("//*[@class=\"ant-popover-content\"]");
	By btn_logout = By.xpath("//*[@href=\"#/logout\"] ");
	By logo_stockbit_homePage = By.xpath("//*[@class=\"logo-big\"] [@src='https://stockbit.com/assets/template/stockbit.svg']");
	By btn_login = By.xpath("//*[@class=\"login-ldn\"] [@href='https://stockbit.com/#/login']");
	By btn_signUp = By.xpath("//*[@class=\"register-lnd\"] [@href='https://stockbit.com/#/register']");
	By btn_profile = By.id("profileLink");
	
	public logoutPage(WebDriver driver) {
			
			this.driver = driver;
		
	}
	
	public void clickAvatar() {
		
		driver.findElement(btn_avatar).click();
		
	}
	
	public void verifyPopoverMenuDisplayed() {
		
		driver.findElement(popover).isDisplayed();
		
	}
	
	public void clickLogoutButton() {
		
		driver.findElement(btn_logout).click();
		
	}
	
	public void verifyHomePage() {
		
		driver.findElement(logo_stockbit_homePage).isDisplayed();
		driver.findElement(btn_login).isDisplayed();
		driver.findElement(btn_signUp).isDisplayed();
		
	}

}
