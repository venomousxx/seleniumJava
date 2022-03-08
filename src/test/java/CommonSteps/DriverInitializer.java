package CommonSteps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitializer {
	
	public WebDriver driver = new ChromeDriver();
	String projectPath = System.getProperty("user.dir");
	
	public void startUp(){
	
		System.getProperty("webdriver.chrome.driver", projectPath+"/driver/chromedrive");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
	    driver.get("https://stockbit.com/");
	}

}
