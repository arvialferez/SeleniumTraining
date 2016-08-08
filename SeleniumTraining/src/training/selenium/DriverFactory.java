package training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	public enum DriverTypes{
		CHROME,
		FIREFOX,
		IE
	}
	
			
	
	public static WebDriver GetDriver(DriverTypes type){
		
		WebDriver driver;
		
		switch(type){
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
				driver = new ChromeDriver();
				break;
				
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
				
			default:
				driver = new FirefoxDriver();
				break;
			
				
		}
		
		return driver;
		
	}
	
	
	
	
	

}
