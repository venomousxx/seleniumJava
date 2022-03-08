package CommonSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aboutUsPage {
	
	WebDriver driver;
	
	By btn_aboutUs = By.xpath("//*[@class='menuchild'][@href='https://stockbit.com/about']");
	By btn_aboutUs2 = By.xpath("//*[@class='menuchild'][text()='About Us']");
	By cls_companyInformation = By.xpath("//*[@class='company-information']");
	
	
	public aboutUsPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void verifyAboutUsbutton() {
		
		driver.findElement(btn_aboutUs2).isDisplayed();
		
	}
	
	public void clickAboutUs() {
		
		driver.findElement(btn_aboutUs).click();
		
	}
	
	public void verifyAboutUsPage() {
		
		driver.findElement(cls_companyInformation).isDisplayed();
		
	}
	
	public void companyInformatio() {
		
		driver.getPageSource().contains("Informasi Perusahaan");
		
	}
	

}
